package polymorphism;

class compiletime{
	public void overloading(int a, char word) {
		System.out.println("overloading 1");
	}
	public void overloading(int a, String plants) {
		System.out.println("overloading 2");
	}
}

public class Compiletime_overloading {

	public static void main(String[] args) {
		compiletime obj = new compiletime();
		obj.overloading(14378, 'A');
		obj.overloading(12, "papaya");
	}

}

// compile time Polymorphism, overloading: When multiple functions having same method name but different parameters. 