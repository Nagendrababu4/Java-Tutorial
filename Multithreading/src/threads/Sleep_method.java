package threads;

public class Sleep_method extends Thread{  //sleep method
	
	public void run() {
		
		try {
			for (int i=0; i<=5; i++) {
				
			Thread.sleep(1000);
			System.out.println("Hello Java "+i);
		   }
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args)  throws InterruptedException
	{
	
	Sleep_method obj = new Sleep_method();
	obj.start();

	}

}
