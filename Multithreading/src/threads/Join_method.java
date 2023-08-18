package threads;

class Spring_season extends Thread{ //join method
	public void run() {
		
		try {
			System.out.println("Spring season started");
			Thread.sleep(1000);     //sleep method
			System.out.println("Spring seasong end......");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Summer_season extends Thread{
	public void run() {
		
		try {
			System.out.println("Summer season started");
			Thread.sleep(1000);
			System.out.println("Summer seaso end.....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
class Winter_season extends Thread{
	public void run() {
		
		try {
			System.out.println("Winter season started");
			Thread.sleep(1000);
			System.out.println("Winter season end.....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
public class Join_method extends Thread{

	public static void main(String[] args) throws InterruptedException
	{
		Spring_season spring = new Spring_season();
		spring.start();
		
		spring.join(1000);
		Summer_season summer = new Summer_season();
		summer.start();
		
		summer.join(2000);
		Winter_season winter = new Winter_season();
		winter.start();
		
	}

}
