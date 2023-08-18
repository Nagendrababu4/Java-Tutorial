package inheritance;


class A{   
	
	void eat(){
		System.out.println("....single inheritance...");
		
		System.out.println("eating....");
	}
}

public class B extends A {
	void bark(){
		System.out.println("barking...");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.eat();
		obj.bark();
		
	}
}

