package fr.mines_nantes.atlanmod.monitoring;

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
	
	static private Logger LOGGER = Logger.getLogger(Watchdog.class.getName());
	FileHandler logMonitor = null;
	SimpleFormatter formatterTxt = null;
	Long totalMem, freeMem;
	Double pctFreeMem;
	int sleepTime;
	Integer relaxCountCPUUsage;
	Integer relaxCountMemUsage;
	boolean stop = false;
	boolean pause = false;
	
	///
	// Logger
	///
	
	public void setLogger() {
		String level;
		try {
			level = ReadConfigurations.getPropertyValue("watchdog_log_level");
			LOGGER.setLevel(Level.parse(level));
			String logFile = ReadConfigurations.getPropertyValue("watchdog_log_file");
			logMonitor = new FileHandler(logFile);
			formatterTxt = new SimpleFormatter();
		    logMonitor.setFormatter(formatterTxt);
		    LOGGER.addHandler(logMonitor);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
	
	///
	// Monitoring
	///
	
	public void run() {
		
		try {
			relaxCountCPUUsage = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_relax_cpu"));
			relaxCountMemUsage = Integer.valueOf(ReadConfigurations.getPropertyValue("monitor_relax_memory"));
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
			       // LOGGER.info("[MONITOR] CPU usage: "+value);
			        // Bigger then 80%
			        if ((Double) value > 0.80) {
			        //	LOGGER.warning("[MONITOR] CPU usage is higher then 80%");
			        	relaxCountCPUUsage--;
			        	// Here I used == to send the message only once.
			        	if (relaxCountCPUUsage<=0){
			        		LOGGER.severe("[MONITOR] Sending CPU altert message to Server");
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
				        LOGGER.info("[MONITOR] Memory usage: "+pctFreeMem+" | free: "+ freeMem + " total: "+totalMem);
				        // Bigger then 80%
				        if (pctFreeMem < 0.2) {
				        	LOGGER.warning("[MONITOR] Memory usage is higher then 80%");
				        	relaxCountMemUsage--;
				        	// Here I used == to send the message only once.
				        	if (relaxCountMemUsage<=0) {
				        		LOGGER.severe("[MONITOR] Sending memory alert message to Server");
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
				Thread.currentThread().sleep(sleepTime);
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
		LOGGER.info("[MONITOR] Stopping Monitoring.");
	}
	
	///
	// Signals from MonitorRunner
	///
	
	public void stopWatchdog() {
		stop = true;
	}
	
	public void pauseWatchdog() {
		pause = true;
	}
	
	public void restartWatchdog() {
		pause = false;
	}
}
