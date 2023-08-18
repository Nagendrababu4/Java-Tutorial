package threads;

public class Interrupt_thread extends Thread{
	public void run() {

		try {
			for (int i=0; i<=5; i++) {
				System.out.println(i);
				Thread.sleep(2000);

				System.out.println(Thread.currentThread().isInterrupted());
				
			}
		}
		catch(Exception e) {
			System.out.println("Thread Interrupt "+ e);
		}
	}

	public static void main(String[] args) {
		Interrupt_thread obj = new Interrupt_thread();
		obj.start();
		obj.interrupt();
		

	}

}
