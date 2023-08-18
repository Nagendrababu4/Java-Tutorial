package multithreading;

class example extends Thread{

	@Override
	public void run() {
		System.out.println("running...");
	}
}
public class Single_thread extends Thread{
	public void run() {
		for (int i=0; i<=5; i++) {
			System.out.println("Thread 2");
		}
	}
	
	public static void main(String[] args) {
		Single_thread obj = new Single_thread();
		example a = new example();
		obj.start();
		a.start();

	}

}
