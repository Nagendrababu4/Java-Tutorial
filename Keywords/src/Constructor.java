
public class Constructor {
	
	int a;
	String name;

	public Constructor(int a1, String name1 ) {
		a = a1;
		name = name1;
		System.out.println("parameterised constructor");
	}	
	
	public Constructor() {
		System.out.println("No argument constructor");
	}
	
//	public Constructor() { // no argument constructor using super keyword
//		
//		super();
//	}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor(12, "anirudh");
		System.out.println(obj.a+" "+obj.name);
		Constructor var = new Constructor();
		
		// TODO Auto-generated method stub

	}

}
