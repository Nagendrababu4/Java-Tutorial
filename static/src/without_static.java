
public class without_static {  //without using static method
		
	int a = 10;
    int b = 23;
	
	public void m1() {
		
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		
		without_static obj = new without_static();
		obj.m1();
		
		
	}

}


//public class without_static {   //with and without static 
//	
//	int a = 10;
//	int b = 23;
//	
//	public void m1() {
//		
//		System.out.println(a+""+b);
//	}
//	
//	static void m2() { //static method allows static variable
//		System.out.println(b);
//	}
//	
//	public static void main(String[] args) {
//		
//		without_static obj = new without_static();
//		obj.m1();
//		obj.m2();
//		
//		
//	}
//
//}
