package encapsulation.java;

public class Encapsulation_Example {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		Encapsulation_Example obj = new Encapsulation_Example();
		obj.setId(12);
		obj.setName("Nagendrababu");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}
}
//Encapsulation: Process of wrapping code and data together data is called Encapsulation
