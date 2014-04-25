package fr.mines_nantes.atlanmod.monitoring;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.monitoring.rmi.Client;
import fr.mines_nantes.atlanmod.monitoring.rmi.MasterImpl;
import fr.mines_nantes.atlanmod.monitoring.rmi.RmiRegistryRunner;

public class MasterRunner {
	
	Thread registryThread;
	Thread masterThread;
	static Client clientRMI = null;
	
	static private Logger LOGGER = Logger.getLogger(StartUp.class.getName());
	static private FileHandler logMaster;
	static private SimpleFormatter formatterTxt;
	private static ArrayList<String> monitorAddresses = new ArrayList<String>();
	private static MasterRunner mR;
	
	public static boolean addMonitorAddresses(String addr) throws NumberFormatException, IOException {
		if (!monitorAddresses.add(addr)) {
			return false;
		} else {
			if (Integer.valueOf(ReadConfigurations.getPropertyValue("server_max_monitors")).equals(monitorAddresses.size())) {
				mR.sendSignal("START");
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
	
	public static void main(String args[]) throws InterruptedException, IOException {
		mR = new MasterRunner();
		mR.setLogger();
		mR.registryRMI();
		mR.startMaster();
		//Thread.currentThread().sleep(15000);
		//mR.sendBroadcastMessage("Testando o broadcast");
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
		            Naming.bind(url, srv);
		        } catch (Exception e) {
		            System.err.println("Server bound exception:");
		            e.printStackTrace();
		        }
    		}
    	};
    	masterThread.run();
    	LOGGER.info("[SERVER] Master started");
	}
	
	public void stopServer() {
		
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
	
	public static void sendSignal(String signal) throws NumberFormatException, IOException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		for (count=0; count<monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
			  LOGGER.info("[SERVER] Testing: "+slave);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      clientRMI.receiveSrvMessage(signal);
		}
	}

	public static void sendBroadcastMessage(String msg) throws IOException {
		int port = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_port"));
		int count;
		String slave;
		for (count=1; count<=monitorAddresses.size();  count++) {
			  slave = monitorAddresses.get(count);
		      clientRMI = monitorConnect("Monitor", slave, port);
		      clientRMI.receiveSrvMessage(msg);
		}
	}
	
}
