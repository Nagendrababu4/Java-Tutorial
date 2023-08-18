package daemon.java;

public class Daemon_Thread extends Thread{
	
public void run() {
		
		if (Thread.currentThread().isDaemon()) {
			
			System.out.println("Daemon thread");
		}
		
		else {
			System.out.println("user thread");
		}
		
		System.out.println("is Alive Thread: "+ Thread.currentThread().isAlive());
	}


	public static void main(String[] args) {
        System.out.println("Main Thread");
		
        Daemon_Thread obj = new Daemon_Thread();
		
		obj.setDaemon(true);
		
		obj.start();
		// TODO Auto-generated method stub

	}

}