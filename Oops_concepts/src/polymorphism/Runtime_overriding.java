package polymorphism;

class Runtime{
	public void overRiding(int a, String name) {
		System.out.println("overriding 1");
	}
}
class Time{
	public void overRiding(int a, String name) {
		System.out.println("overriding 2");
	}
}

public class Runtime_overriding {

	public static void main(String[] args) {
		Runtime obj = new Runtime();
		obj.overRiding(14378, "Anirudh");
		
		Time obj1 = new Time();
		obj1.overRiding(12, "Rishika");
	}
}

// Runtime polymorphism, overriding: multiple class having same method name and same parameters
