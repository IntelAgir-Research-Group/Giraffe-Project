package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

import fr.mines_nantes.atlanmod.monitoring.Adviser;
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
	private static int countCreated = 0;

	public MasterImpl() throws RemoteException {
        super();
    }
     
    public synchronized Boolean receiveMonitorNames(String a) throws NumberFormatException, IOException {
    	return MasterRunner.addMonitorAddresses(a);
    }

	public synchronized Boolean receiveCPUAlert() throws RemoteException, InterruptedException {
		Adviser.cpuAlerts();
		return true;
	}

	public synchronized Boolean receiveMemAlert() throws RemoteException, InterruptedException {
		Adviser.cpuAlerts();
		return true;
	}
	
	public synchronized Boolean receiveCreatedMessage(boolean tf) throws RemoteException, InterruptedException {
		if (tf == false) {
			return false;
		} else {
			countCreated++;
			if (countCreated == MasterRunner.monitorAddresses.size()) {
				MasterRunner.setCreated();
			}
		}
		return true;
	}
}
