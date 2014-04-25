package fr.mines_nantes.atlanmod.monitoring;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.monitoring.rmi.*;

public class MonitorRunner {
	
	static Boolean stop = false;
	static private Logger LOGGER = Logger.getLogger(StartUp.class.getName());
	private FileHandler logMonitor;
	private SimpleFormatter formatterTxt;
	static private String hostSrv = "";
	static private int portSrv = 0;
	static private String srvName = "";
	static private Master SrvRMI = null;
	private Watchdog wd;
	private static InetAddress ip;
	
	public static void main(String args[]) throws UnknownHostException {
		MonitorRunner monR = new MonitorRunner();
		monR.startMonitor();
	}
	
	// Remove that method
	public void startMonitor() throws UnknownHostException {
		setLogger();		
		registryRMI();
		startWatch();
	}
	
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
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
		
	public void startWatch() {
		wd = new Watchdog();
		wd.start();
	}
	
	public void stopWatch() {
		wd.stopWatchdog();
	}
	
	public void stopMonitor() throws InterruptedException {
		// stop=true;
		stopWatch();
	//	System.exit(0);
	}
	
	///
	// RMI creating session
	///
	public void creatLocalRegistry() {
		LOGGER.info("[MONITOR] Creating a Local Registry instance");
		Integer port;
		try {
			port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
			new RmiRegistryRunner(port);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registryRMI() {
		///
		// Take the <<name>> and the <<host>> in the <<slaves>> file.
		///
		LOGGER.info("[MONITOR] Registering in the RMI");
		creatLocalRegistry();
		try {
        	// Creating a server RMI
            String name = "Monitor";
            ClientImpl monitor = new ClientImpl();
            String host = "127.0.0.1";
            Integer port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
            String url="rmi://"+host+":"+port+"/"+name;
            Naming.bind(url, monitor);
            addInMasterList();
        } catch (Exception e) {
            LOGGER.warning("[MONITOR] Error: "+e.toString());
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
	    LOGGER.info("[MONITOR] Looking up " + strName + "...");
	    try
        {
            SrvRMI = (Master) Naming.lookup(strName);
            ip = InetAddress.getLocalHost();
            if (!SrvRMI.receiveMonitorNames(ip.getHostAddress())) {
            	LOGGER.severe("[MONITOR] Error adding"+ip.getHostAddress()+" in the monitors list");
            }
        }
        catch (Exception e)
        {
	        LOGGER.warning("[MONITOR] Client: Exception thrown looking up " + strName);
	        LOGGER.warning("[MONITOR] Error message: "+ e.getMessage());
        }
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
            SrvRMI = (Master) Naming.lookup(strName);
        }
        catch (Exception e)
        {
	        LOGGER.warning("[MONITOR] Client: Exception thrown looking up " + strName);
	        LOGGER.warning("[MONITOR] Error message: "+ e.getMessage());
        }
	}
	
	public static void sendAlert(String alert) {
		srvConnect("Server");
		try {
			if (!SrvRMI.receiveMonitorMessages(alert)) {
			    LOGGER.warning("[MONITOR] Client: Remote receiveMonitorMessages() call failed.");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
