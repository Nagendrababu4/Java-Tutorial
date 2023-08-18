package threads;

public class Interrupted_thread extends Thread{
	
	public void run() {
		
		System.out.println(Thread.interrupted());
	
//		System.out.println(Thread.currentThread().isInterrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
		try {
			for (int i=0; i<=5; i++) {
				
				System.out.println(i);
				Thread.sleep(2000);

				System.out.println(Thread.interrupted());
				
			}
		}
		catch(Exception e) {
			System.out.println("Thread Interrupt "+ e);
		}
	}


	public static void main(String[] args) {
		Interrupted_thread obj = new Interrupted_thread();
		obj.start();
		obj.interrupt();
		// TODO Auto-generated method stub

	}

}
