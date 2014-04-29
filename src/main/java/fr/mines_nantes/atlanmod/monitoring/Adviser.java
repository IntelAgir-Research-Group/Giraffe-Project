package fr.mines_nantes.atlanmod.monitoring;

import java.io.IOException;
import java.util.Date;

public class Adviser {
	
	private static long lastCPUTimestamp, lastMemTimestamp=0;
	
	// Receive the alerts then tell to Master what it needs to do.
	
	// CPU alerts
	public static void cpuAlerts() throws InterruptedException {
		// Maybe it is necessary to be got in the Monitor, because the network latencies.
		Date date = new Date();
		long timeStamp = date.getTime();
		// Improve that value (15 seconds? / Get from properties file)
		if (((timeStamp-lastCPUTimestamp)/1000)<=15) {
			// Alert to create a new node
			// 2 alerts from different nodes
			System.out.println("Requesting more CPU...");
			try {
				// Sending a pause signal to the monitors
				MasterRunner.sendSignal("STOP");
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		lastCPUTimestamp = timeStamp;
	}
	
	// Memory alerts
	public static void memAlerts() throws InterruptedException {
		Date date = new Date();
		long timeStamp = date.getTime();
		// Improve that value (15 seconds? / Get from properties file)
		if (((timeStamp-lastMemTimestamp)/1000)<=15) {
			// Alert to create a new node
			// 2 alerts from different nodes
			System.out.println("Requesting more memory...");
			try {
				// Sending a pause signal to the monitors
				MasterRunner.sendSignal("STOP");
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		lastMemTimestamp = timeStamp;
	}
	
	// Disk alerts
	public static void diskAlerts() {
		
	}
}
