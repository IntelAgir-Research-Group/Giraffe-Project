package fr.mines_nantes.atlanmod.strategies.master;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.annotation.Annotation;

import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Exec;
import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.annotations.Stress;
import fr.mines_nantes.atlanmod.monitoring.master.MasterRunner;
import fr.mines_nantes.atlanmod.monitoring.rmi.master.MasterImpl;

public class Distributor {
	
	String cName;
	Method createMethod = null;
	int deploySlaveMethods = 0;
	int deployMasterMethod = 0;
	int stressMethod = 0;
	int monitorMethods = 0;
	ArrayList<Method> execMethods = new ArrayList<Method>();
	Object runner;
	
	public Distributor(String className) {
		cName = className;
		methodsClassify();
		methodsSchedule();
	}
	
	public void methodsClassify() {
		try {
			System.out.println("Getting methods/annotations from class "+cName);
			runner = Class.forName(cName).newInstance();
			
			//AutoScaleExecution runner = new AutoScaleExecution();
	        Method[] methods = runner.getClass().getMethods();
	        	        
	        for (Method method : methods) {
	            Create c = method.getAnnotation(Create.class);
	            if (c != null) {
	              //  createMethods=1;
	            	createMethod = method;
	            } else {
	            	Deploy d = method.getAnnotation(Deploy.class);
		            if (d != null) {
		            	if (d.type().equals("master")) {
		            		deployMasterMethod=1;
		            	} else {
		            		deploySlaveMethods=1;
		            	}
		            } else {
		            	Monitor m = method.getAnnotation(Monitor.class);
			            if (m != null) {
			                monitorMethods=1;
			            } else {
			            	Exec e = method.getAnnotation(Exec.class);
				            if (e != null) {
				                execMethods.add(method);
				            } else {
				            	Stress s = method.getAnnotation(Stress.class);
					            if (s != null) {
					                stressMethod = 1;
					            }
				            }
			            }
		            }
	            }
	        }
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void methodsSchedule() {
		if (createMethod != null) {
			try {
				createMethod.invoke(runner);
				// Will wait for all monitors connect
				System.out.println("[DISTRIBUTOR] Waiting for all monitors");
				while(!MasterRunner.allMonitors) {
					Thread.sleep(1000);
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		// Deploying Master
		if (deployMasterMethod > 0) {
			System.out.println("Setting count as 1");
			MasterImpl.setExecCount(1);
			MasterRunner.sendDeployMaster();
		}
		
		// Deploying Slaves
		if (deploySlaveMethods > 0) {
			MasterImpl.setExecCount(0);
			try {
				MasterRunner.sendDeployApp();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Starting monitors
		if (monitorMethods>0) {
			try {
				MasterRunner.sendStartMonitoring();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Starting stress
		if (stressMethod>0) {
			try {
				MasterRunner.sendStress();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
		// All actions
		for (Method m : execMethods) {
			Exec e = m.getAnnotation(Exec.class);
			int seq = e.sequence();
			try {
				MasterRunner.sendExecAction(seq);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}