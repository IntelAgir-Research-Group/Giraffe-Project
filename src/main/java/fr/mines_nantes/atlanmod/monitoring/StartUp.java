package fr.mines_nantes.atlanmod.monitoring;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.monitoring.rmi.*;

/**
 * 
 * @author albonico
 *
 */

////
// Wait for a exit signal
// Create a JAR to execute in different machines
// Verify areas to use synchonized
// Wait for all monitors connect (amount of monitors), so close the connections
// Create a ServerRunner
// Start with a shell script and when is necessary to create a new node, do that using Java
// MonitorRunner and ServerRunner with static methodos to start they (String host, int port)
// How to react when receive the messages? Maybe putting the methodos all in the Impl classes? :)
// Send a message to the server with the IP, Port (random, to be possible use more than 1 monitor per machine) and Service name
////

public class StartUp {
	
	static private Logger LOGGER = Logger.getLogger(StartUp.class.getName());
	static private FileHandler logServer;
	static private SimpleFormatter formatterTxt;
	/*
	Thread registryThread;
	Thread masterThread;
	
	static Client clientRMI = null;
	
	public void createReg() {
    	registryThread = new Thread() {
			public void run() {
				new RmiRegistryRunner();
			}
		};
		registryThread.run();
    }

    public void startMaster() {    	 
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
    }
    */
	
	public static void main(String[] args) throws InterruptedException, SecurityException, IOException {
		
			String level = ReadConfigurations.getPropertyValue("server_log_level");
			LOGGER.setLevel(Level.parse(level));
			logServer = new FileHandler("log-rmi-server.txt");
			formatterTxt = new SimpleFormatter();
		    logServer.setFormatter(formatterTxt);
		    LOGGER.addHandler(logServer);
		    
			//StartUp rm = new StartUp();
		    MasterRunner mR = new MasterRunner();
		    
			LOGGER.info("[SERVER] Creating the Registry.");
			mR.registryRMI();
		
			LOGGER.info("[SERVER] Starting the Master.");
			mR.startMaster();
			LOGGER.info("[SERVER] Master started.");
			LOGGER.info("[SERVER] Waiting for connections.");
			
			LOGGER.info("[SERVER] Starting monitors.");
			MonitorRunner m = new MonitorRunner();
	//		m.startMonitor();
			
			Thread.currentThread().sleep(1000);
			
			mR.sendBroadcastMessage("Testando broadcast...");
    }
	
}
