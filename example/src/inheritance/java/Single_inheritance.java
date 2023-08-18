package inheritance.java;

class Parent{
	public void parent_class() {
		System.out.println("Parent class...");
	}
}
class Child extends Parent{
	public void child_class() {
		System.out.println("child class....");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		System.out.println("Single inheritance....");
		Child obj = new Child();
		obj.parent_class();
		obj.child_class();
	}
}
//Define: In single inheritance one class extends other class 