package clonning.java;

class Clonning_C{
	String course_1;
	String course_2;
	
	public Clonning_C(String course_1, String course_2) {
		this.course_1 = course_1;
		this.course_2 = course_2;
	}
}
public class Example implements Cloneable{
	int id;
	String name;
	public Example(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		Clonning_C obj = new Clonning_C("Java", "AEM");
		Example obj1 = new Example(14378, "Nagendra Babu");
		System.out.println("learner-1: "+obj1.id+" "+obj1.name+" "+obj.course_1+" "+obj.course_2);
		
		try {
			Example obj2 = (Example) obj1.clone();
			System.out.println("learner-2: "+obj1.id+" "+obj1.name+" "+obj.course_1+" "+obj.course_2);
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
