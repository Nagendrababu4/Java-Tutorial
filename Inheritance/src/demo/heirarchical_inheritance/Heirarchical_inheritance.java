package demo.heirarchical_inheritance;

class Parent{
	public void Parent_class() {
		System.out.println("Parent class..");
	}
}

class child1 extends Parent{
	public void child1_class() {
		System.out.println("child_1 class...");
	}
}

class child2 extends Parent{
	public void child2_class() {
		System.out.println("Child_2 class");
	}
}

public class Heirarchical_inheritance {

	public static void main(String[] args) {
		System.out.println("Heirarchical inheritance...");
		child1 obj = new child1();
		child2 obj1 = new child2();
		obj.Parent_class();
		obj.child1_class();
		obj1.child2_class();
	}
}

// Define: In Hierarchical inheritance same class is inherited by multiple subclass
