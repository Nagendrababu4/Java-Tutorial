package demo.multilevel_inheritance;

class A{
	void eat() {
		System.out.println("....Multilevel_inheritance....");
		System.out.println("eating");
	}
}

class B extends A{
	void bark() {
		System.out.println("barking");
	}
}

public class C extends B{
	void play() {
		System.out.println("playing");
	}

	public static void main(String[] args) {
		C Obj = new C();
		Obj.eat();
		Obj.bark();
		Obj.play();

	}

}
