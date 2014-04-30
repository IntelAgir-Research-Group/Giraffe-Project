package fr.mines_nantes.atlanmod.parser;


import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Exec;
import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.monitoring.MasterRunner;

public class Distributor {
	
	String cName;
	int createMethods = 0;
	ArrayList<Method> deployMethods = new ArrayList<Method>();
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
			runner = Class.forName(cName).newInstance();
			
			//AutoScaleExecution runner = new AutoScaleExecution();
	        Method[] methods = runner.getClass().getMethods();

	        for (Method method : methods) {
	            Create c = method.getAnnotation(Create.class);
	            if (c != null) {
	                createMethods=1;
	            } else {
	            	Deploy d = method.getAnnotation(Deploy.class);
		            if (d != null) {
		                deployMethods.add(method);
		            } else {
		            	Monitor m = method.getAnnotation(Monitor.class);
			            if (m != null) {
			                monitorMethods=1;
			            } else {
			            	Exec e = method.getAnnotation(Exec.class);
				            if (e != null) {
				                execMethods.add(method);
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
		
		// Execution sequence (Create -> Deploy -> Monitor -> Exec)
		// For now, only one create method is possible
		if (createMethods>0) {
			try {
				//MasterRunner.sendSignal("CREATE");
				MasterRunner.createNodes();
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
			
		if (deployMethods.size() > 1) {
			// The first monitor will execute only the first method
			// For now, only 2 deploy methods are possible
			int count = 1;
			for (Method m : deployMethods) {
				try {
					if (count==1){
						MasterRunner.deployMaster();
					} else {
						MasterRunner.deployApp();
						break;
					}
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
				count++;
			}
		} else {
			try {
				MasterRunner.deployApp();
			} catch (Exception e ){
				System.out.println("Error: "+e.getMessage());
			}
	    }	
		
		if (monitorMethods>0) {
			
		}
				
		for (Method m : execMethods) {
			try {
                m.invoke(runner);
            } catch (Exception e) {
                e.printStackTrace();
            }
		}
		
	}
}