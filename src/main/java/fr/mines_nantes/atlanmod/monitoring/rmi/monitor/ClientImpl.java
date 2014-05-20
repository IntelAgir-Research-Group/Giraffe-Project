package fr.mines_nantes.atlanmod.monitoring.rmi.monitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;

public class ClientImpl extends UnicastRemoteObject implements Client {

	public ClientImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author albonico 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Signal {
	    START, STOP, RESTART, KILL
	}
	
	public synchronized void receiveID(int id) throws RemoteException, InterruptedException {
		MonitorRunner.printLog("[MONITOR] ID received: "+id);
		MonitorRunner.setID(id);
		MonitorRunner.printLog("[MONITOR] ID setted");
	}
	
	public Boolean receiveSetWatchSignal() throws RemoteException, InterruptedException {
		MonitorRunner.startWatchdog();
		return true;
	}

	public Boolean receiveSrvMessage(String msg) throws RemoteException, InterruptedException {
		MonitorRunner.printLog("[MONITOR] Message received: "+msg);
		Signal s = Signal.valueOf(msg);
		
			switch(s) {
			case START: 
				//MonitorRunner.setStart(true);
				MonitorRunner.createWatchdog();
				return true;
			case STOP:
				//MonitorRunner.pauseWatchdog();
				MonitorRunner.pauseWatchdog();
				MonitorRunner.pauseStress();
				return true;
			case RESTART:
				MonitorRunner.restartWatchdog();
				MonitorRunner.restartStress();
				return true;
			case KILL:
				MonitorRunner.stopMonitor();
				return true;
			}
			
			return true;
	}

	public synchronized void receiveDeployMaster() throws RemoteException, InterruptedException {
		MonitorRunner.sendExecuted(MonitorRunner.deployMaster());
	}

	public synchronized void receiveDeployApp() throws RemoteException, InterruptedException {
		MonitorRunner.sendExecuted(MonitorRunner.deployApp());
	}

	public synchronized void receiveExecAction(int seq) throws RemoteException, InterruptedException {
		// TODO Auto-generated method stub
		MonitorRunner.printLog("[MONITOR] Sequence execution recieved: "+seq);
		try {
			MonitorRunner.sendExecuted(MonitorRunner.execAction(seq));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean receiveStartStress() throws RemoteException, InterruptedException {
		MonitorRunner.printLog("[MONITOR] Received the stress signal");
		try {
			MonitorRunner.startStress();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
