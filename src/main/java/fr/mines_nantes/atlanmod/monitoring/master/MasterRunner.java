package fr.mines_nantes.atlanmod.monitoring.master;

import java.io.IOException;
import java.lang.reflect.Method;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.security.AccessControlException;
import java.security.Permission;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.hadoop.conf.Configuration;
import org.virtualbox_4_1.VirtualBoxManager;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.monitoring.frameworks.HDFS;
import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;
import fr.mines_nantes.atlanmod.monitoring.rmi.RmiRegistryRunner;
import fr.mines_nantes.atlanmod.monitoring.rmi.master.MasterImpl;
import fr.mines_nantes.atlanmod.monitoring.rmi.monitor.Client;
import fr.mines_nantes.atlanmod.monitoring.scaleclasses.AutoScaleExecution;
import fr.mines_nantes.atlanmod.strategies.master.Distributor;

public class MasterRunner {
	
	Thread registryThread;
	Thread masterThread;
	static Client clientRMI = null;
	
	static private Logger LOGGER = Logger.getLogger(MasterRunner.class.getName());
	static private FileHandler logMaster;
	static private SimpleFormatter formatterTxt;
	public static ArrayList<String> monitorAddresses = new ArrayList<String>();
	private static MasterRunner mR;
	public static boolean allMonitors = false;
//	private static boolean created = false;
//	private static boolean masterDeployed = false;
//	private static boolean appDeployed = false;
	private static boolean broken = false;
	private static boolean monitoring = false;
	private static boolean executed = false;
	private static boolean noScalable = false;
	private static boolean firstMonitor = true;
	
	public static boolean addMonitorAddresses(int monitorID, String addr) throws NumberFormatException, IOException {
		monitorAddresses.add(monitorID, addr);
		LOGGER.info("[SERVER] Monitor added to list");
			
		// Sending id to Monitor
		
		if (firstMonitor==true) {
			LOGGER.info("[SERVER] Setting master IP "+addr);
			MasterImpl.masterIP = addr;
			firstMonitor = false;
		}
		
		String host = addr;
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		
		clientRMI = monitorConnect("Monitor", host, port);
		
		try {
			clientRMI.receiveID(monitorID);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LOGGER.info("[SERVER] Monitor ID sent");
		
		if (Integer.valueOf(ReadConfigurations.getPropertyValue("server_max_monitors")) == monitorAddresses.size()) {
			allMonitors=true;
		}  else {
			LOGGER.info("[SERVER] Waiting for more monitors. MAX: "+ReadConfigurations.getPropertyValue("server_max_monitors")+
					" | Monitors: "+monitorAddresses.size());
		}
		
		return true;
	}
	
	public void setLogger() {
		String level;
		try {
			level = ReadConfigurations.getPropertyValue("server_log_level");
			LOGGER.setLevel(Level.parse(level));
			String logFile = ReadConfigurations.getPropertyValue("server_log_file");
			logMaster = new FileHandler(logFile);
			formatterTxt = new SimpleFormatter();
		    logMaster.setFormatter(formatterTxt);
		    LOGGER.addHandler(logMaster);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
	
	public void startMaster() {
		LOGGER.info("[SERVER] Starting the Master");
		masterThread = new Thread() {
    		public void run() {
    			try {
		        	// Creating a server RMI
		            String name = "Server";
		            MasterImpl srv = new MasterImpl();
		            String host = ReadConfigurations.getPropertyValue("server_host");
		            Integer port = Integer.valueOf(ReadConfigurations.getPropertyValue("server_port"));
		            String url="rmi://"+host+":"+port+"/"+name;
		            Naming.rebind(url, srv);
		        } catch (Exception e) {
		            System.err.println("Server bound exception:");
		            e.printStackTrace();
		        }
    		}
    	};
    	masterThread.run();
    	LOGGER.info("[SERVER] Waiting for connections...");
	}

	public void registryRMI() {
		LOGGER.info("[SERVER] Creating the Registry");
		registryThread = new Thread() {
			public void run() {
				new RmiRegistryRunner();
			}
		};
		registryThread.run();
		LOGGER.info("[SERVER] Registry created");
	}
	
	public static Client monitorConnect(String monitorName, String monitorHost, int monitorPort) {
		// Connecting with the monitor
		String monitorURL = "rmi://"+monitorHost+":"+monitorPort+"/"+monitorName;
	    LOGGER.info("[SERVER] Looking up " + monitorURL + "...");
	    try
        {
            clientRMI = (Client) Naming.lookup(monitorURL);
        }
        catch (Exception e)
        {
	        LOGGER.warning("[SERVER] Exception thrown looking up " + monitorURL);
	        LOGGER.warning("[SERVER] Error message: "+ e.getMessage());
        }
	    LOGGER.info("[SERVER] Connected to: "+monitorURL); 
	    return clientRMI;
	}
	
	public static void sendSignal(String signal) throws NumberFormatException, IOException, InterruptedException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		//for (count=0; count<monitorAddresses.size();  count++) {
		for (count=0; count<monitorAddresses.size();  count++) {
			slave = monitorAddresses.get(count);
		    clientRMI = monitorConnect("Monitor", slave, port);
		    System.out.println("[SERVER] Sending the "+signal+" signal to "+slave+" | Monitors total: "+monitorAddresses.size());
		    clientRMI.receiveSrvMessage(signal);
			System.out.println("[SERVER] Signal sent to "+slave);
		}
	}

	public static void sendBroadcastMessage(String msg) throws IOException, InterruptedException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		for (count=1; count<=monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      clientRMI.receiveSrvMessage(msg);
		}
	}
	
	public static void sendMasterDeploy() throws IOException, InterruptedException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		LOGGER.info("[SERVER] Sending master deploy signal to monitors");
		for (count=0; count<monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      LOGGER.info("[SERVER] RMI Client: "+clientRMI.toString());
		      clientRMI.receiveDeployMaster();
		}
		LOGGER.info("[SERVER] Master deploy signal sent");
	}
	
	public static void sendAppDeploy() throws NumberFormatException, IOException, InterruptedException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		for (count=0; count<monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      clientRMI.receiveDeployApp();
		}
	}
	
	public static void sendAction(int seq) throws NumberFormatException, IOException, InterruptedException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		for (count=0; count<monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      clientRMI.receiveExecAction(seq);
		}
	}
	
	public static void sendStress() throws NumberFormatException, IOException, InterruptedException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		for (count=0; count<monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      clientRMI.receiveStartStress();
		}
	}
	
	/*
	public static void sendStressSignal() throws NumberFormatException, IOException, InterruptedException {
		MasterRunner.sendSignal("STRESS");
	}
	
	public static boolean createNodes() throws NumberFormatException, IOException, InterruptedException {
		MasterRunner.sendSignal("CREATE");
		while(!created) {
			// While until all nodes are created
		}
		reactiveInBrokenCase();
		return true;
	}
	*/
	
	public static boolean sendDeployMaster() {
		try {
			MasterRunner.sendMasterDeploy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!executed) {
			// While until all nodes are created
		}
		executed = false;
		reactIfBroken();
		return true;
	}
	
	public static boolean sendDeployApp() throws NumberFormatException, IOException, InterruptedException {
	//	MasterRunner.sendSignal("DEPLOY");
		LOGGER.info("[SERVER] Executing app deploy");
		MasterRunner.sendAppDeploy();
		while(!executed) {
			// While until all nodes are created
		}
		reactIfBroken();
		return true;
	}
	
	public static boolean sendExecAction(int seq) throws NumberFormatException, IOException, InterruptedException {
		LOGGER.info("[SERVER] Executing action");
		MasterRunner.sendAction(seq);
		MasterImpl.setExecCount(0);
		while(!executed) {
			// While until all nodes are created
		}
		return true;
	}
		
	public static boolean sendStartMonitoring() throws NumberFormatException, IOException, InterruptedException {
		setMonitoringSignal(false);
		MasterRunner.sendSignal("START");
		// waitMonitoring();
		return true;
	}
	
	public static void waitForAllMonitors() {
		while(!monitoring) {
			// While until all nodes are created
		}
	}
	
	public static void reactIfBroken() {
		if (broken) {
			System.out.println("Do something, because the system is broken... ");
		}
	}
	
	/*
	public static void setCreated() {
		created=true;
	}
	*/
	
	/*
	public static void setAppMasterDeployed() {
		masterDeployed=true;
	}
	*
	
	/*
	public static void setAppDeployed() {
		appDeployed=true;
	}
	*/
	
	public static void setMonitoringSignal(boolean b) {
		LOGGER.info("[SERVER] Setting monitoring signal to "+b);
		monitoring=b;
	}
	
	public static void setBroken() {
		broken = true;
	}
	
	public static void setExecuted() {
		LOGGER.info("[SERVER] Setting executed to true");
		executed = true;
	}
	
	public static void main(String args[]) throws InterruptedException, IOException {
		
		
			// To prevent possible problems when nodes trying to connect to master
			if (System.getSecurityManager() == null) {
				System.setSecurityManager (new RMISecurityManager() {
					public void checkPermission(Permission perm) {}
				    public void checkConnect (String host, int port) {}
				    public void checkConnect (String host, int port, Object context) {}
				  });
		    }
			
			// Starting the master
			mR = new MasterRunner();
			
			mR.setLogger();
			mR.registryRMI();
			mR.startMaster();
			
			
			// Wait for monitors, then, execute the Auto scaling
			/*
			while(!allMonitors) {
				// wait
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			*/
			
			//LOGGER.info("TESTING: "+(String) ReadConfigurations.getPropertyValue("server_auto_scale_class"));
			
			//AutoScaleExecution ae = new AutoScaleExecution();
			//ae.deployMaster();
			
			//HDFSManager hdfs = new HDFSManager();
			//hdfs.startNameNode();
			
			String autoScaleClassDist = (String) ReadConfigurations.getPropertyValue("server_auto_scale_class");
			Distributor dist = new Distributor(autoScaleClassDist);
			
			// This will not allow the master pass while Distributor is executing and it will wait for a noScalable signal too. 
			///// 
			// That will be implemented soon...
			/////
			/*
			while (!noScalable) {
				// Wait
				Thread.sleep(1000);
			}
			*/
			
			// Kill Monitors
			LOGGER.info("Stopping monitors.");
			try {
				mR.sendSignal("KILL");
			} catch (Exception e) {
				// Nothing to do
			}
			
			LOGGER.info("Stopping master.");
			// Kill Master
			System.exit(0);
	}
}
