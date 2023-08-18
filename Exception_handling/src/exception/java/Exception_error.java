package exception.java;

public class Exception_error {

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		try {
			
			System.out.println(100/0);
		}
		catch(Exception e) {
			
			System.out.println("letter D");
//			System.out.println('\n'+"D letter"+'\n');
		
		}
		System.out.println("E");
		System.out.println("F");
		System.out.println("G");
		System.out.println("H");
	
	}

}
