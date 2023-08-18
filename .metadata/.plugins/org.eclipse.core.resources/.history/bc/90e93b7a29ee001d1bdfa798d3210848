package threads;

public class Yield_method extends Thread{  //yield method
	public void run() {
		try {
			Thread.yield();
			for(int i=0; i<=5; i++) {

				System.out.println("child method: "+i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Yield_method obj = new Yield_method();
		obj.start();
		
		try {
			
			for(int i=0; i<=5; i++) {

				System.out.println("parent method: "+i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
