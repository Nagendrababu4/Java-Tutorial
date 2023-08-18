package demo.heirarchical_inheritance;

class A{
	void play() {
		System.out.println("....Heirarchical inheritance....");
		System.out.println("playing");
	}
}

class B extends A{
	void sleep() {
		System.out.println("sleeping");
	}
}
public class C extends A{
	void eat() {
		System.out.println("eating");
	}

	public static void main(String[] args) {
		C obj = new C();
		obj.play();
		obj.eat();
		
		B obj1 = new B();
		obj1.sleep();
	}

}
