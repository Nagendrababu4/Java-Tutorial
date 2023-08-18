package clonning.java;

public class Clonning_Ex implements Cloneable{
	String name;
	int id;
	String course_1;
	String course_2;
	
	public Clonning_Ex(String name, int id, String course_1, String course_2) {
		this.name = name;
		this.id = id;
		this.course_1 = course_1;
		this.course_2 = course_2;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args)
	{ 
		Clonning_Ex obj = new Clonning_Ex("Anirudh", 14378, "Java", "AEM");
		System.out.println("object1: "+obj.name+" "+obj.id+" "+obj.course_1+" "+obj.course_2);
		
		try {
			Clonning_Ex obj1 = (Clonning_Ex)obj.clone();
			
			System.out.println("object2: "+obj1.name+" "+obj1.id+" "+obj.course_1+" "+obj.course_2);
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
