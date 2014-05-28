package fr.mines_nantes.atlanmod.monitoring.monitor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.monitoring.frameworks.HDFS;
import fr.mines_nantes.atlanmod.monitoring.rmi.*;
import fr.mines_nantes.atlanmod.monitoring.rmi.master.Master;
import fr.mines_nantes.atlanmod.monitoring.rmi.monitor.ClientImpl;
import fr.mines_nantes.atlanmod.strategies.monitor.Executor;

public class MonitorRunner {
	
	static Boolean stop = false;
	static private Logger LOGGER = Logger.getLogger(MonitorRunner.class.getName());
	private FileHandler logMonitor;
	private SimpleFormatter formatterTxt;
	static private String hostSrv = "";
	static private int portSrv = 0;
	static private String srvName = "";
	static private Master srvRMI = null;
	static private Watchdog wDog;
	private static InetAddress ipAddress;
	private static boolean startSignal = false;
//	private static String monitorName="";
	private static Executor execObj;
	
	///
	// ID
	///
	public static int ID = 0;
	
	public static int getID() {
		return ID;
	}
	
	public static void setID(int id) {
		ID = id;
	}
	
	///
	// Logger
	///
	public void setLogger() {
		String level;

			try {
				level = ReadConfigurations.getPropertyValue("monitor_log_level");
				LOGGER.setLevel(Level.parse(level));
				String logFile = ReadConfigurations.getPropertyValue("monitor_log_file");
				logMonitor = new FileHandler(logFile);
				formatterTxt = new SimpleFormatter();
			    logMonitor.setFormatter(formatterTxt);
			    LOGGER.addHandler(logMonitor);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void printLog(String log) {
		LOGGER.info(log);
	}
	
	///
	// Watchdog
	///
	
	public static void startWatchdog() {
		//wd.startW();
		wDog.startWatchdog();
	}
	
	public static void createWatchdog() {
		LOGGER.info("[MONITOR] Starting to watch. / start = "+startSignal);
	
		//for (int i=0; i<=10; i++) {
			
		//	LOGGER.info("Testing :"+ID+" i ");
			
		/*
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		*/
		
		Watchdog.startWatchdog();
		//LOGGER.info("[MONITOR] Watching. ");
		//wd.pauseWatchdog();
		//wd.startW();
		
		// Waiting until master send a signal to start to monitoring
		/*
		while(!start) {
			LOGGER.info("[MONITOR] Waiting for start signal.");
			// waiting
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		//wd.startW();
	}
	
	public static void stopWatch() {
		wDog.stopWatchdog();
	}
	
	public static void pauseWatchdog() {
		wDog.pauseWatchdog();
	}
	
	public static void restartWatchdog() {
		wDog.restartWatchdog();
	}
	
	
	// Remove that method
	/*
	public void startMonitor() throws NumberFormatException, IOException, AlreadyBoundException {
		setLogger();		
		registryRMI();
		startWatch();
	}
	*/
	
	public static void setStart(boolean b) {
		LOGGER.info("[MONITOR] Setting start as "+b);
		startSignal = b;
	}
	
	public static void stopMonitor() throws InterruptedException {
		// stop=true;
		stopWatch();
		System.exit(0);
	}
		
	///
	// RMI creating session
	///
	public void creatLocalRegistry() throws UnknownHostException {
		LOGGER.info("[MONITOR] Creating a Local Registry instance");
        ipAddress = InetAddress.getLocalHost();
		Integer port;
		try {
			port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
			new RmiRegistryRunner(port, ipAddress.getHostAddress());
		} catch (Exception e) {
			LOGGER.severe("[MONITOR] Error: "+e.getMessage());
			System.exit(0);
		} 
	}
	
	public void registryRMI() throws UnknownHostException {
		///
		// Take the <<name>> and the <<host>> in the <<slaves>> file.
		///
		LOGGER.info("[MONITOR] Creating a local RMI Registry");
		creatLocalRegistry();

		try {
        	// Creating a server RMI
            String name = "Monitor";
            ClientImpl monitor = new ClientImpl();
            //String host = "172.28.2.65";
            // Need to set hostname IP Address in /etc/hosts  
            String host = ipAddress.getHostAddress();
            Integer port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
            String url="rmi://"+host+":"+port+"/"+name;
            Naming.bind(url, monitor);
            addInMasterList();
		} catch(Exception e) {
			LOGGER.severe("[MONITOR] Error: "+e.getMessage());
		}
	}
	
	public void addInMasterList() {
		try {
			hostSrv = (String) ReadConfigurations.getPropertyValue("server_host");
			portSrv = Integer.valueOf(ReadConfigurations.getPropertyValue("server_port"));
			srvName = (String) ReadConfigurations.getPropertyValue("server_name");
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		// Connecting with the server
		String strName = "rmi://"+hostSrv+":"+portSrv+"/"+srvName;
	    LOGGER.info("[MONITOR] Registering monitor in the Server ");
	    try
        {
            srvRMI = (Master) Naming.lookup(strName);
            if (!srvRMI.receiveMonitorName(ipAddress.getHostAddress())) {
            	LOGGER.severe("[MONITOR] Error adding"+ipAddress.getHostAddress()+" in the monitors list");
            }
        }
        catch (Exception e)
        {
	        LOGGER.warning("[MONITOR] Client: Exception thrown looking up " + strName);
	        LOGGER.warning("[MONITOR] Error message: "+ e.getMessage());
        }
	    LOGGER.info("[MONITOR] Registered");
	}
	
	public static void srvConnect(String srvName) {
		try {
			hostSrv = (String) ReadConfigurations.getPropertyValue("server_host");
			portSrv = Integer.valueOf(ReadConfigurations.getPropertyValue("server_port"));
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		// Connecting with the server
		String strName = "rmi://"+hostSrv+":"+portSrv+"/"+srvName;
	    LOGGER.info("Client: Looking up " + strName + "...");
	    try
        {
            srvRMI = (Master) Naming.lookup(strName);
        }
        catch (Exception e)
        {
	        LOGGER.warning("[MONITOR] Client: Exception thrown looking up " + strName);
	        LOGGER.warning("[MONITOR] Error message: "+ e.getMessage());
        }
	}
	
	///
	// Alerts to Master
	///
	
	public static void sendMemAlert() throws InterruptedException {
		srvConnect("Server");
		try {
			if (!srvRMI.receiveMemAlert()) {
			    LOGGER.warning("[MONITOR] Client: Remote receiveMonitorMessages() call failed.");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.warning("[MONITOR] Sending the memory alert to Master");
	}
	
	public static void sendCPUAlert() throws InterruptedException {
		srvConnect("Server");
		try {
			if (!srvRMI.receiveCPUAlert()) {
			    LOGGER.severe("[MONITOR] Client: Remote receiveMonitorMessages() call failed.");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.warning("[MONITOR] Sending the CPU alert to Master");
	}
	
	/*
	public static void sendCreatedMsg(boolean b) {
		srvConnect("Server");
		try {
			if (!SrvRMI.receiveCreatedMessage(b)) {
			    LOGGER.severe("[MONITOR] Client: Remote receiveCreatedMessage() call failed.");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sendMasterDeployed(boolean b) {
		srvConnect("Server");
		try {
			if (!SrvRMI.receiveDeployAppMasterMessage(b)) {
			    LOGGER.severe("[MONITOR] Client: Remote receiveDeployAppMasterMessage() call failed.");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/
	
	/*
	public static void sendDeployAppMessage(boolean b) {
		srvConnect("Server");
		try {
			if (!SrvRMI.receiveDeployAppMessage(b)) {
			    LOGGER.severe("[MONITOR] Client: Remote sendDeployAppMessage() call failed.");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	*/
	
	public static void sendExecuted(boolean b) throws RemoteException, InterruptedException {
		srvConnect("Server");
		if (!srvRMI.receiveExecuted(b)) {
		    LOGGER.severe("[MONITOR] Client: Remote sendExecuted() call failed.");
		}
	}
	
	public static String getMasterIP() throws RemoteException, InterruptedException {
		srvConnect("Server");
		String masterIP = srvRMI.readMasterAppIP();
		LOGGER.info("[Monitor] Getting master IP: "+masterIP);
		return masterIP;
	}
	
	///
	// Executing the actions
	///
	
	public static void instExecutor(String instClass) {
		String cl = instClass;
		execObj = new Executor(cl);
	}
	
	/*
	public static boolean createNode() {
		executor();
		LOGGER.info("[MONITOR] Creating node!");
		if (execObj.execCreator()){
			LOGGER.info("[MONITOR] Node created!");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean deployMasterApp() {
		executor();
		LOGGER.info("[MONITOR] Deploying master app!");
		if (exec.execDeployMaster()){
			LOGGER.info("[MONITOR] App master deployed!");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}
	*/
	
	public static boolean deployApp() {
	//	instExecutor();
		LOGGER.info("[MONITOR] Deploying app!");
		if (execObj.execDeploy()){
			LOGGER.info("[MONITOR] App deployed!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean execAction(int seq) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	//	instExecutor();
		LOGGER.info("[MONITOR] Executing action sequence "+seq);
		if (execObj.execAction(seq)){
			LOGGER.info("[MONITOR] Action executed");
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean deployMaster(String masterClass, String masterMethod) {
		instExecutor(masterClass);
		execObj.execDeployMaster(masterMethod);
		return true;
	}
	
	public static boolean startStress() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		execObj.execStress();
		return true;
	}
	
	public static boolean pauseStress() {
		HDFS.setPauseStress(true);
		return true;
	}
	
	public static boolean restartStress() {
		HDFS.setPauseStress(false);
		return true;
	}
	
	public static boolean stopStress() {
		HDFS.stopStress();
		return true;
	}
	
	///
	// Starting Monitor
	///
	
	public static void main(String args[]) throws NumberFormatException, IOException, AlreadyBoundException {
		MonitorRunner monR = new MonitorRunner();
		//monitorName = "Monitor"+monR.hashCode();
		//monR.startMonitor();
		monR.setLogger();		
		monR.registryRMI();
	}
}
