 package multithreading;

public class Current_thread extends Thread{
	public void run() {
		
		
//		Thread.currentThread().setName("Thread 1");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().isAlive()); //determine thread is still running
	}
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("current Thread inside the main method: Thread 2");
		System.out.println(Thread.currentThread().getName());
		
//		Thread.currentThread().setName("set thread");
//		System.out.println(Thread.currentThread().getName());
		
		Current_thread obj = new Current_thread();
		obj.start();
		// TODO Auto-generated method stub

	}

}