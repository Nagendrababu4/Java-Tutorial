package exception.java;

public class Test_3 {
	
	public void arithmetic_exception() {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("arithmetic exception: "+e.getMessage()+'\n');
		}	
	}
	public void StringIndex_excpetion() {
		try {
			String name = "Exception handling concept";
			char c = name.charAt(30);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			
			System.out.println("String Index exception: "+ e.getMessage()+'\n');
		}
	}
	public void nullpointer_exception() {
		try {
			String name = null;
			System.out.println(name.length());
			
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
		catch(NullPointerException e) {
			System.out.println("null pointer exception: "+"\r"+e.getMessage()+'\n');
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void arrayIndex_exception() {
		try {
			int a[] = new int[5];
			a[7]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayIndex exception: "+e.getMessage()+'\n');
		}
	}
	public static void main(String[] args) {
		
		Test_3 obj = new Test_3();
		obj.arithmetic_exception();
		obj.StringIndex_excpetion();
		obj.nullpointer_exception();
		obj.arrayIndex_exception();
	}
}
