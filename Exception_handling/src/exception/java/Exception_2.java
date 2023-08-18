package exception.java;

public class Exception_2 {

	public static void main(String[] args) {
		try {
			int z = 13/56;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Exception handling");
		}

	}

}
