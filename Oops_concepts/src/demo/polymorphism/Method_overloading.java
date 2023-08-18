package demo.polymorphism;

public class Method_overloading {
	
	void a() {
		System.out.println("no parameter");
	}
	void a(char word, boolean mybool) {
		System.out.println("character: "+ word +" "+"boolean: "+mybool);
	}
	void a(int b, int a) {
		System.out.println(b+a);
	}

	public static void main(String[] args) {
		Method_overloading obj = new Method_overloading();
		obj.a();
		obj.a('N', true);
		obj.a(20, 12);

	}
}

// method overloading : multiple methods with the same method name but different parameters
