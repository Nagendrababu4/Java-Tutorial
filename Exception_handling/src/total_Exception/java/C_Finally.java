package total_Exception.java;

public class C_Finally {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Finally block"); //Optional
		}

	}

}
