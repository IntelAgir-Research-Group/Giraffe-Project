package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import fr.mines_nantes.atlanmod.monitoring.MasterRunner;

/**
 * 
 * @author albonico
 *
 */

public class MasterImpl extends UnicastRemoteObject implements Master {
	
	/**
	 * @author albonico
	 */
	
	private static final long serialVersionUID = 1L;

	public MasterImpl() throws RemoteException {
        super();
    }
    
    public synchronized Boolean receiveMonitorMessages(String a) throws RemoteException {
    	System.out.println("[SERVER] Monitor message: "+a);
    	return true;
    }
    
    public synchronized Boolean receiveMonitorNames(String a) throws NumberFormatException, IOException {
    	System.out.println("Putting <<"+a+">> in the list");
    	return MasterRunner.addMonitorAddresses(a);
    }
}
