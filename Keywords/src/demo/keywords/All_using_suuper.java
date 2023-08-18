package demo.keywords;

class time{
	
	int a=199;
	
	time(){
		System.out.println("inside example constructor"); //invoke parent class constructor using super keyword
	}
	
	void m1() {
		System.out.println("inside m1 method....."); //invoke parent class method using super keyword
	}
}

public class All_using_suuper extends time {
	
	int a = 10;
	void m() {
		
	    System.out.println(this.a +" "+" instance variable" );
		System.out.println(super.a);     //current class instance variable using super keyword
	
	}
	
	void m2() {
		super.m1();
		m();
	}

	public static void main(String[] args) {
		All_using_suuper obj = new All_using_suuper();
		obj.m2();
		// TODO Auto-generated method stub

	}

}
