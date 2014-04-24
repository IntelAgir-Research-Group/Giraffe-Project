package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

////
// Wait for a exit signal
// Configuration file
// Create a JAR to execute in different machines
// Verify areas to use synchonized
// Wait for qtde conectar
// 
////

/**
 * 
 * @author albonico
 *
 */

public class MasterImpl implements Master {
	
	Thread registryThread;
	Thread masterThread;
	
	public MasterImpl() {
        super();
    }

    public <T> T executeTask(Task<T> t) {
        return t.execute();
    }
    
    public void createReg() throws InterruptedException {
    	
    	registryThread = new Thread() {
    		public void run() {
    			try {
    		  		LocateRegistry.createRegistry(1099);
    		  	} catch (RemoteException re) {
    		  		System.out.println(re.toString());
    		  	}
    		}
    	};
		
    	registryThread.run();
    }

    public void startMaster() {    	
    	 
    	masterThread = new Thread() {
    		public void run() {
		        try {
		            String name = "Server";
		          
		            Master srv = new MasterImpl();
		            Master stub = (Master) UnicastRemoteObject.exportObject(srv, 0);
		            
		            Registry registry = LocateRegistry.getRegistry("127.0.0.1",1099);
		            
		            registry.rebind(name, stub);
		            
		        } catch (Exception e) {
		            System.err.println("Server bound exception:");
		            e.printStackTrace();
		        }
    		}
    	};
    	
    	masterThread.run();
    }
}
