package total_Exception.java;

public class B_Try_catch_Exception_Handling {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		
	}
}

//Explanation: After getting Exception error, 'try' throw the error and 'catch' block will handle the error.
