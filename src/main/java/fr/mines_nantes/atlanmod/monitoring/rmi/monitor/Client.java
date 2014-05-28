package fr.mines_nantes.atlanmod.monitoring.rmi.monitor;

import java.lang.reflect.Method;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote{
	public Boolean receiveSrvMessage(String msg) throws RemoteException, InterruptedException;
	public void receiveID(int id) throws RemoteException, InterruptedException;
	public void receiveDeployMaster(String masterClass, String masterMethod) throws RemoteException, InterruptedException;
	public void receiveDeployApp() throws RemoteException, InterruptedException;
	public void receiveExecAction(int seq) throws RemoteException, InterruptedException;
	public Boolean receiveSetWatchSignal() throws RemoteException, InterruptedException;
	public Boolean receiveStartStress() throws RemoteException, InterruptedException;
}
