package priorities.java;

public class Thread_priorities extends Thread{
	
	public void run() {
		
		System.out.println("child thread priority: "+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(4);
		System.out.println("user thread priority: "+ Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		System.out.println("Parent thread priority: "+ Thread.currentThread().getPriority());
		
		System.out.println("MIN_PRIORITY priority: "+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		
		System.out.println("NORM_PRIORITY priority: "+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(NORM_PRIORITY);
		
		System.out.println("MAX_PRIORITY priority: "+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		
		Thread_priorities obj = new Thread_priorities();
		
		Thread obj1 = new Thread(obj);
		
		obj1.start();

		// TODO Auto-generated method stub

	}

}




