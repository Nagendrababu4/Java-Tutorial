package exception.java;

public class Exception_1 {

	public static void main(String[] args) {
		try {
			int a = 15/0;
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("exception occur");
		}

	}

}
