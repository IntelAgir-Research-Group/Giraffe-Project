package fr.mines_nantes.atlanmod.monitoring;

import java.io.IOException;
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

import org.virtualbox_4_1.VirtualBoxManager;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.monitoring.rmi.Client;
import fr.mines_nantes.atlanmod.monitoring.rmi.MasterImpl;
import fr.mines_nantes.atlanmod.monitoring.rmi.RmiRegistryRunner;
import fr.mines_nantes.atlanmod.parser.Distributor;

public class MasterRunner {
	
	Thread registryThread;
	Thread masterThread;
	static Client clientRMI = null;
	
	static private Logger LOGGER = Logger.getLogger(MasterRunner.class.getName());
	static private FileHandler logMaster;
	static private SimpleFormatter formatterTxt;
	public static ArrayList<String> monitorAddresses = new ArrayList<String>();
	private static MasterRunner mR;
	private static boolean allMonitors = false;
	private static boolean created = false;
	private static boolean masterDeployed = false;
	private static boolean appDeployed = false;
	private static boolean broken = false;
	
	public static boolean addMonitorAddresses(String addr) throws NumberFormatException, IOException {
		if (!monitorAddresses.add(addr)) {
			LOGGER.severe("[SERVER] Error adding monitor to the list");
			return false;
		} else {
			if (Integer.valueOf(ReadConfigurations.getPropertyValue("server_max_monitors")).equals(monitorAddresses.size())) {
				allMonitors=true;
				//MasterRunner.sendSignal("START");
				return true;
			} else {
				return false;
			}
		}
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
	    return clientRMI;
	}
	
	
	public static void sendSignal(String signal) throws NumberFormatException, IOException, InterruptedException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		for (count=0; count<monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      clientRMI.receiveSrvMessage(signal);
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
	
	public static boolean createNodes() throws NumberFormatException, IOException, InterruptedException {
		MasterRunner.sendSignal("CREATE");
		while(!created) {
			// While until all nodes are created
		}
		reactiveInBrokeCase();
		return true;
	}
	
	public static boolean deployMaster() throws NumberFormatException, IOException, InterruptedException {
		MasterRunner.sendSignal("DEPLOYMASTER");
		while(!masterDeployed) {
			// While until all nodes are created
		}
		reactiveInBrokeCase();
		return true;
	}
	
	public static boolean deployApp() throws NumberFormatException, IOException, InterruptedException {
		MasterRunner.sendSignal("DEPLOY");
		while(!appDeployed) {
			// While until all nodes are created
		}
		reactiveInBrokeCase();
		return true;
	}
	
	public static void reactiveInBrokeCase() {
		if (broken) {
			System.out.println("Do something, because the system is broken... ");
		}
	}
	
	public static void setCreated() {
		created=true;
	}
	
	public static void setAppMasterDeployed() {
		masterDeployed=true;
	}
	
	public static void setAppDeployed() {
		appDeployed=true;
	}
	
	public static void setBroken() {
		broken = true;
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
			while(!allMonitors) {
				// wait
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			String autoScaleClass = (String) ReadConfigurations.getPropertyValue("server_auto_scale_class");
			Distributor exec = new Distributor(autoScaleClass);
			
			// Kill Monitors
			/*
			try {
				mR.sendSignal("KILL");
			} catch (Exception e) {
				// Nothing to do
			}
			*/
			
			// Kill Master
			//System.exit(0);

	}
	
}
