package fr.mines_nantes.atlanmod.monitoring;

public class MonitorRunner extends Thread {
	
	static Boolean stop = false;
	
	public void run() {
		while (!stop) {
			//System.out.println("T1...");
			/*
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}
	}
	
	public static void startMon() throws InterruptedException {
		
		
		
		/*
		synchronized (lock) {
			while(stop==0) {
				//lock.notify();
				System.out.println("Teste...");
				lock.wait();
				//lock.notify();
			}
		}
		*/
		
	}
	
	public void stopMon() throws InterruptedException {
		stop=true;
	//	lock.notify();
		
		/*
		synchronized (lock) {
			lock.notify();
		}
		*/
			
			//	lock.wait();
		//	lock.notify();
		//}
	}

}
