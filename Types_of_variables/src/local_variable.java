
public class local_variable {
	
	public void local() {
		int b = 23;        //local variable
		System.out.println(b);
	}
	
//	public void local1() {
//		int b = 23;
//		System.out.println(b);
//	}

	public static void main(String[] args) {
//		System.out.println(b); //local method allows local variable in same method, we cannot access variable in another method
		
		local_variable sc = new local_variable();
		sc.local();
//		sc.local1();
		// TODO Auto-generated method stub

	}

}


// Hint: we can call Inside the method. we cannot call all the methods.
