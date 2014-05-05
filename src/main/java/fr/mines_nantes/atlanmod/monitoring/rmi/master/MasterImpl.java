package fr.mines_nantes.atlanmod.monitoring.rmi.master;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.logging.Logger;

import com.sun.org.apache.commons.logging.Log;

import fr.mines_nantes.atlanmod.monitoring.master.MasterRunner;
import fr.mines_nantes.atlanmod.strategies.master.Adviser;

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
	private static int countDeployed = 0;
	private static int execCount = 0;
	private static int executedCount = 0;
	
	// ID Monitors
	private static int monitorsCount = -1;
	
	public static void setExecCount(int size) {
		executedCount = 0;
		if (size == 0) {
			execCount = monitorsCount+1;
		} else {
			execCount = size;
		}
	}

	public MasterImpl() throws RemoteException {
        super();
    }
     
    public synchronized Boolean receiveMonitorNames(String a) throws NumberFormatException, IOException {
    	monitorsCount++;
    	return MasterRunner.addMonitorAddresses(monitorsCount, a);
    }

	public synchronized Boolean receiveCPUAlert() throws RemoteException, InterruptedException {
		Adviser.cpuAlerts();
		return true;
	}

	public synchronized Boolean receiveMemAlert() throws RemoteException, InterruptedException {
		Adviser.memAlerts();
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
			return true;
		}
	}
	
	/*
	public synchronized Boolean receiveDeployAppMasterMessage(boolean md) throws RemoteException, InterruptedException {
		if (md == false){
			return false;
		} else {
			executedCount++;
			if (executedCount == execCount) {
				execCount = 0;
				MasterRunner.setAppMasterDeployed();
			}
			return true;
		}
	}
	
	public synchronized Boolean receiveDeployAppMessage(boolean ad) throws RemoteException, InterruptedException {
		if (ad == false) {
			MasterRunner.setBroken();
	//		return false;
		}
		
		countDeployed++;
		// Set to -1 when will use master
		if (countDeployed == (MasterRunner.monitorAddresses.size())) {
			MasterRunner.setAppDeployed();
		}
		
		return true;
	}
	*/
	
	public synchronized Boolean receiveExecuted(boolean exec) throws RemoteException, InterruptedException {
		if (exec == false){
			return false;
		} else {
			System.out.println("Executed: "+executedCount);
			System.out.println("Expected: "+execCount);
			executedCount++;
			if (executedCount == execCount) {
				execCount = 0;
				MasterRunner.setExecuted();
			}
			return true;
		}
	}
}
