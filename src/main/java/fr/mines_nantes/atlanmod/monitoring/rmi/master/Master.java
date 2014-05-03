package fr.mines_nantes.atlanmod.monitoring.rmi.master;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Master extends Remote {
    public Boolean receiveMonitorNames(String a) throws RemoteException, NumberFormatException, IOException;
    public Boolean receiveCPUAlert() throws RemoteException, InterruptedException;
    public Boolean receiveMemAlert() throws RemoteException, InterruptedException;
    public Boolean receiveCreatedMessage(boolean tf) throws RemoteException, InterruptedException;
    public Boolean receiveDeployAppMasterMessage(boolean md) throws RemoteException, InterruptedException;
    public Boolean receiveDeployAppMessage(boolean ad) throws RemoteException, InterruptedException;
}
