package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientImpl extends UnicastRemoteObject implements Client {

	public ClientImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author albonico 
	 */
	private static final long serialVersionUID = 1L;

	public void receiveSrvMessage(String msg) throws RemoteException {
		System.out.println("[MONITOR] Message received: "+msg);
	}
}
