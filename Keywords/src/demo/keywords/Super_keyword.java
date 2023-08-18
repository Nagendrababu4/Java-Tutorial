package demo.keywords;

class Test{        
	int v = 100;          //by using instance variable
}

public class Super_keyword extends Test{
	
	int a = 10;
	void m(int a) {
		System.out.println(a);
		System.out.println(this.a);  //current class instance variable using this keyword
		System.out.println(super.v); //parrent class instance variable using super keyword
	}

	public static void main(String[] args) {
		Super_keyword obj = new Super_keyword();
		obj.m(20);

	}

}
