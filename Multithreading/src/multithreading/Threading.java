package multithreading;

class thread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Threading implements Runnable{
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("multiple threads using Runnable interface");
		
		Threading obj = new Threading();// create Thread
//		obj.start();
		thread obj1 = new thread();
		
		Thread t = new Thread(obj);
		t.start();
		
		thread obj2 = new thread();
		Thread a = new Thread(obj1);
		a.start();
	}
}

