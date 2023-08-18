package demo.multilevel_inheritance;

class GrandParent{
	public void GrandParent_class() {
		System.out.println("Grand parent class..");
	}
}
class Parent1 extends GrandParent{
	public void parent_class() {
		System.out.println("parent class");
	}
}
class Child1 extends Parent1{
	public void Child_class() {
		System.out.println("Child class");
	}
}
public class Multilevel_inheritance {

	public static void main(String[] args) {
		System.out.println("Multilevel Inheritance..");
		Child1 obj = new Child1();
		obj.GrandParent_class();
		obj.parent_class();
		obj.Child_class();
	}
}

// Define: Multilevel inheritance contains two or more class, one class inherits
// from a derived class. Hence the derived class becomes the base class for new class.