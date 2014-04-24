package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Master extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;
}
