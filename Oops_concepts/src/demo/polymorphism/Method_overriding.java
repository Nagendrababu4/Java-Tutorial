package demo.polymorphism;

class display{           //method overriding
	void m1(int a) {
		System.out.println("inside display");
	}
}

public class Method_overriding extends display{
	
	final void m1(int a) {
		System.out.println("inside m1");
	}

	public static void main(String[] args) {
		
//		final int z = 10;
//		z = z+20;
//		System.out.println(z);
		
		Method_overriding obj = new Method_overriding();
		obj.m1(10);
		display obj1 = new display();
		obj1.m1(23);
	}

}

//method overriding : different class having same method name and same parameter
