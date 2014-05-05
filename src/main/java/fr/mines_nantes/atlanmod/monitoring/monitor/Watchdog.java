package fr.mines_nantes.atlanmod.monitoring.monitor;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import fr.mines_nantes.atlanmod.ReadConfigurations;

public class Watchdog extends Thread {
	
	static Long totalMem;
	static Long freeMem;
	static Double pctFreeMem;
	static int sleepTime;
	static Integer relaxCountCPUUsage;
	static Integer relaxCountMemUsage;
	static double pctCPU;
	static double pctMem;
	static boolean stop = false;
	static boolean pause = false;
	
	///
	// Monitoring
	///
	
	public static void startW() {
		//Thread.currentThread().yield();
		
		new Thread() {
		
		public void run() {
			
		MonitorRunner.printLog("[WATCHDOG] Watchdog started.");
		try {
			relaxCountCPUUsage = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_relax_cpu"));
			relaxCountMemUsage = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_relax_memory"));
			pctCPU = Double.valueOf(ReadConfigurations.getPropertyValue("watchdog_pct_cpu"));
			pctMem = Double.valueOf(ReadConfigurations.getPropertyValue("watchdog_pct_mem"));
		} catch (NumberFormatException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		while (!stop) {	
			// Waiting (when are adding new nodes)
			while (pause) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
			Method[] methods = operatingSystemMXBean.getClass().getDeclaredMethods();
			
			  for (java.lang.reflect.Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
			    method.setAccessible(true);
			    
			    // Monitoring CPU usage
			    if ((method.getName().startsWith("getSystemCpuLoad"))) {
			    	Object value;
			        try {
			            value = method.invoke(operatingSystemMXBean);
			        } catch (Exception e) {
			            value = e;
			        }
			        MonitorRunner.printLog("[WATCHDOG] CPU usage: "+value);
			        // Bigger then 80%
			        if ((Double) value > pctCPU) {
			        //	LOGGER.warning("[MONITOR] CPU usage is higher then 80%");
			        	relaxCountCPUUsage--;
			        	// Here I used == to send the message only once.
			        	if (relaxCountCPUUsage<=0){
			        		MonitorRunner.printLog("[WATCHDOG] Sending CPU altert message to Server");
			        		//MonitorRunner.sendCPUAlert("CPU usage is higher then 80%");
			        		try {
								MonitorRunner.sendCPUAlert();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			        	}
			        }
			    }
				// Monitoring memory usage
			    if ((method.getName().startsWith("getTotalPhysicalMemorySize"))) {
			    	Object value;
			        try {
			            value = method.invoke(operatingSystemMXBean);
			        } catch (Exception e) {
			            value = e;
			        }		
			        totalMem = (Long) value;   
			     }
			    
			     if ((method.getName().startsWith("getFreePhysicalMemorySize"))) {
			    	Object value;
			        try {
			            value = method.invoke(operatingSystemMXBean);
			        } catch (Exception e) {
			            value = e;
			        }
			        freeMem = (Long) value;
			        if (totalMem>(long) 0) {
				        pctFreeMem = (double)freeMem/(double)totalMem;
				        MonitorRunner.printLog("[WATCHDOG] Memory usage: "+pctFreeMem+" | free: "+ freeMem + " total: "+totalMem);
				        
				        if (pctFreeMem < pctMem) {
				        	
				        	MonitorRunner.printLog("[WATCHDOG] Memory free is less then "+pctMem);
				        	relaxCountMemUsage--;
				        	// Here I used == to send the message only once.
				        	if (relaxCountMemUsage<=0) {
				        		MonitorRunner.printLog("[WATCHDOG] Sending memory alert message to Server");
				        		//MonitorRunner.sendMemAlert("Memory usage is higher then 80%");
				        		try {
									MonitorRunner.sendMemAlert();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
				        	}
				        } 
			        }
			    }
			  }
			
			try {
				sleepTime = Integer.valueOf(ReadConfigurations.getPropertyValue("watchdog_sleep_time"));
				Thread.sleep(sleepTime);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		}.start();
		MonitorRunner.printLog("[WATCHDOG] Stopping Monitoring.");
	}
	
	///
	// Signals from MonitorRunner
	///
	
	public static void stopWatchdog() {
		MonitorRunner.printLog("[WATCHDOG] Stopping watchdog.");
		stop = true;
	}
	
	public static void pauseWatchdog() {
		MonitorRunner.printLog("[WATCHDOG] Pausing watchdog.");
		pause = true;
	}
	
	public static void restartWatchdog() {
		MonitorRunner.printLog("[WATCHDOG] Restarting watchdog.");
		pause = false;
	}
	
	public static void teste() {
		System.out.println("Testing...");
	}
}
