
public class Class_object_exam {
	
	String name = "Anirudh";
	public void eat() {
		System.out.println("Eating.....");
	}

	public static void main(String[] args) {
		
		Class_object_exam dog = new Class_object_exam();
		dog.eat();
		System.out.println("name: " + dog.name);
		
	}

}
