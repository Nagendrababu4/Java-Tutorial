package total_Exception.java;

public class D_Throw {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			throw e;
		}

	}

}

//Throw: 'catch' block throw the exception to 'Throw' block then java stops the program execution(throw the Exception).
