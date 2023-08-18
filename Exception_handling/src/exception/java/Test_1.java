package exception.java;

public class Test_1 {

	public static void main(String[] args) {
	try {
		String name = null;
		System.out.println(name.length());
		
	}
	catch(ArithmeticException e) {
		System.out.println("arithmetic exception");
	}
	catch(NullPointerException e) {
		System.out.println("null pointer exception");
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}

}
