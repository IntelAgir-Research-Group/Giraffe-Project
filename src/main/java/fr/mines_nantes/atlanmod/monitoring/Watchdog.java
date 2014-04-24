package fr.mines_nantes.atlanmod.monitoring;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Watchdog {

	private Logger LOGGER = Logger.getLogger(ResourcesMonitoring.class.getName());
	private FileHandler logWatchdog;
	private SimpleFormatter formatterTxt;
	
	public void startMonitor() throws InterruptedException {
		MonitorRunner m1 = new MonitorRunner();
		m1.start();
	}
	
	public static void sendAnAlert(List<Integer> l) {
		
	}
	
	public void stopMonitor() throws InterruptedException {
		Thread.currentThread().sleep(1000);
		MonitorRunner m2 = new MonitorRunner();
		m2.stopMon();
	}
}
