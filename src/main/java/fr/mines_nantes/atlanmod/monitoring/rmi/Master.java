package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Master extends Remote {
    public Boolean receiveMonitorMessages(String a) throws RemoteException; 
    public Boolean receiveMonitorNames(String a) throws RemoteException, NumberFormatException, IOException;
}
