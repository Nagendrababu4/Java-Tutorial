package total_Exception.java;

public class A_Exception_error {
	
	//Explanation:
	/* 
	 * Stacktrace
	 * 
	 * Exception name -  java.lang.ArithmeticException
	 * Exception message - / by zero
	 * Whick line number - 18
	 * Method info - total_Exception.java.Exception_error.main
	 */
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}

}
