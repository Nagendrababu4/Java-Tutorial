
public class with_static { 
	
	static int a = 10;
	static int b = 20;
	
	public static void disp() {   //static method allows only static variable
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		
		with_static obj = new with_static();
		obj.disp();
		with_static.disp();
		disp();
		// TODO Auto-generated method stub

	}

}


// Hint: using static we can create object we can call that object. or we can call without creating object also....