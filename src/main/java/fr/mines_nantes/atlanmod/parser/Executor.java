package fr.mines_nantes.atlanmod.parser;

import java.lang.reflect.Method;

import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.monitoring.MonitorRunner;

public class Executor {
	
	private static String cName="";
	private static Object runner;
	
	public Executor(String className) {
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
	}
	
	public boolean execCreator() {
		
			MonitorRunner.printLog("[EXECUTOR] Creating a new node");
		
			//AutoScaleExecution runner = new AutoScaleExecution();
	        Method[] methods = runner.getClass().getMethods();

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
	
	public void execDeploy() {
		
	}
	
	public void execMonitor() {
		
	}
	
	public void execAction() {
		
	}
	
}
