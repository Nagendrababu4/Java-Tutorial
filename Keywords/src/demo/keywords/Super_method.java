package demo.keywords;

class m{                     
	void m2() {                //by using method
		
		System.out.println("inside m2 method"); 
	}
}
public class Super_method extends m{
	void m1() {
		System.out.println("inside Super_method");

//		super.m2();
		
	}
	void m3() {
		
		super.m2();               //invoke parent class method
	}

	public static void main(String[] args) {
		Super_method obj = new Super_method();
		obj.m3();
	}

}
