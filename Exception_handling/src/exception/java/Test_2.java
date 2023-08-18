package exception.java;



public class Test_2 {

	public static void main(String[] args) {
		try {
			String name = "Exception handling concept";
			char c = name.charAt(30);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			
			System.out.println("String Index Out Of Bounds Exception");
			
		}

	}

}
