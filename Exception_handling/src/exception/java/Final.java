package exception.java;

public class Final {

	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("arithmetic exception");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("null pointer exception");
		}
		finally {
			System.out.println("java code will execute");
		}
		System.out.println("Welcome to the java world");

	}

}
