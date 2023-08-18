
public class Static_variable { 
	
	static int a = 34;    //static variable
	
	public static void static_v() {
		System.out.println(a);
	}
	
	public static void static_s() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Static_variable obj = new Static_variable();
		obj.static_v();
		obj.static_s();
		
		
		// TODO Auto-generated method stub

	}

}

// Hint: we can call inside class and outside the method. we can call inside the method using static keyword.
