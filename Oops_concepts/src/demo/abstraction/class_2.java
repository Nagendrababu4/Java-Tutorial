package demo.abstraction;

public class class_2 extends Abstract_class{   //Inheritance

	@Override
	public void state() {                      //method overriding
		System.out.println("state code");
		
	}
	@Override
	public void town() {
		System.out.println("town code");
		
	}
	public static void main(String args[]) {   //main mathod
		class_2 obj = new class_2();
		obj.state();
		obj.town();
		
		obj.city();
		obj.district();
		

	}
}
