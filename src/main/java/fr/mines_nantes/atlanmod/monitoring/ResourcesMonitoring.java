package fr.mines_nantes.atlanmod.monitoring;

import java.io.IOException;
import java.util.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import fr.mines_nantes.atlanmod.monitoring.rmi.*;

/**
 * 
 * @author albonico
 *
 */

public class ResourcesMonitoring {
	
	static private Logger LOGGER = Logger.getLogger(ResourcesMonitoring.class.getName());
	static private FileHandler logServer;
	static private SimpleFormatter formatterTxt;

	public static void main(String[] args) throws InterruptedException, SecurityException, IOException {
		
			LOGGER.setLevel(Level.INFO);
			logServer = new FileHandler("log-rmi-server.txt");
			formatterTxt = new SimpleFormatter();
		    logServer.setFormatter(formatterTxt);
		    LOGGER.addHandler(logServer);
		    
			Boolean masterStopSignal = false;
			MasterImpl m = new MasterImpl();
		
			LOGGER.info("Creating the Registry.");
			m.createReg();
		
			LOGGER.info("Starting the Master.");
			m.startMaster();
			LOGGER.info("Master started.");
			LOGGER.info("Waiting for connections.");
			
			LOGGER.info("Starting monitor.");
			Watchdog w = new Watchdog();
			w.startMonitor();
			
			LOGGER.info("Stopping monitor.");
			w.stopMonitor();
			
			stopMonitoring();
    }
	
	public static void stopMonitoring() {
		sendBroadcatStopSignal();
		LOGGER.info("Stopping the system.");
		System.exit(0);
	}
	
	public static void sendBroadcatStopSignal() {
		// Send a signal to all watchdogs and wait until they answer to exit.
	}

}
