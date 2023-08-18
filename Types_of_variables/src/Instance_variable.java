
public class Instance_variable {  
	
	int a = 10;   //instance variable
	
	public void disp() {
		System.out.println(a);
	}
	
	public void d() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Instance_variable obj = new Instance_variable();
		obj.disp();
		obj.d();
		
	}

}


// Hint: Inside the class and outside the method. we can call inside all methods.... 
