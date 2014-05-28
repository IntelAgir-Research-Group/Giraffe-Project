package fr.mines_nantes.atlanmod.strategies.monitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Exec;
import fr.mines_nantes.atlanmod.annotations.Stress;
import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;

public class Executor {
	
	private static String cName="";
	private static Object runner;
	
	Method[] methods;
	Object inst;
	String args[];
	
	public Executor(String className) {
		Class<?> c;
		try {
			c = Class.forName(className);
			inst = c.newInstance();
			methods = c.getDeclaredMethods();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		/*
		cName = className;
		try {
			runner = Class.forName(cName).newInstance();
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
        methods = runner.getClass().getMethods();
        */
	}
	
	public boolean execCreator() {
		
			MonitorRunner.printLog("[EXECUTOR] Creating a new node");

	        for (Method method : methods) {
	            Create c = method.getAnnotation(Create.class);
	            if (c != null) {
	                try {
	                    method.invoke(runner);
	                    return true;
	                } catch (Exception e) {
	                	e.printStackTrace();
	                 	return false;
	                }
	            } 
	       }  
	       return false;
	}
	
	public boolean execDeploy() {
		MonitorRunner.printLog("[EXECUTOR] Deploying the app - monitor "+MonitorRunner.getID());
		// Creating a execution sequence
		for (Method method : methods) {
			Deploy c = method.getAnnotation(Deploy.class);
            if (c != null && c.type().equals("slave") && (c.monitor() == MonitorRunner.getID() || 
            		c.monitor() == -2 || (c.monitor() == -1 && MonitorRunner.getID() != 0))) {
            	try {
					method.invoke(runner);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
		}
		return true;
	}
	
	public boolean execDeployMaster(String masterMethod) {
		MonitorRunner.printLog("[EXECUTOR] Deploying the master");
		for (Method m : methods) {
			if (m.getName().equals(masterMethod)) {
				m.setAccessible(true);
				try {
					m.invoke(inst, args);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// Creating a execution sequence
		for (Method method : methods) {
			Deploy c = method.getAnnotation(Deploy.class);
            if (c != null && c.type().equals("master") && (c.monitor() == MonitorRunner.getID() || 
            		c.monitor() == -2 || (c.monitor() == -1 && MonitorRunner.getID() != 0))) {
            	try {
					method.invoke(runner);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
		}
		
		return true;
	}
	
	public void execMonitor() {
		
	}
	
	public boolean execAction(int seq) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Executing specified action
		for (Method method : methods) {
			Exec e = method.getAnnotation(Exec.class);
			if (e != null) {
				if (e.sequence() == seq) {
					method.invoke(runner);
				}
			}
		}
		return true;
	}
	
	public boolean execStress() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Method method : methods) {
			Stress s = method.getAnnotation(Stress.class);
			if (s != null) {
				method.invoke(runner);
			}
		}
		return true;
	}
	
}
