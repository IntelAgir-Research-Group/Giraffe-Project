package fr.mines_nantes.atlanmod.monitoring.rmi.monitor;

import java.lang.reflect.Method;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote{
	public Boolean receiveSrvMessage(String msg) throws RemoteException, InterruptedException;
	public void receiveID(int id) throws RemoteException, InterruptedException;
	public void deployMaster() throws RemoteException, InterruptedException;
	public void deployApp() throws RemoteException, InterruptedException;
	public void execAction(int seq) throws RemoteException, InterruptedException;
	public Boolean setWatchSignal() throws RemoteException, InterruptedException;
}
