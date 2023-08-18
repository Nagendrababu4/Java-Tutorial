

public class This_keword {
	int a;
	public void exam(int a) {    //current class instance variable using this keyword
		this.a = a;
	}
	public void display() {      //current class instance variable using this keyword
		System.out.println(a);
	}
	
	void m1() {                   //invoke current class method using this keyword
//		m2();
		this.m2();//we can use this.m2 or m2()same output will come
		System.out.println("inside m1 method");
	}
	void m2() {                    //invoke current class method using this keyword
		System.out.println("inside m2 method");
	}
	
	public This_keword(int a) {     //invoke current class constructor
		System.out.println("parameterised constructor");
	}
	public This_keword() {            //invoke current class constructor
		This_keword obj = new This_keword(20);
//		this(30);
		System.out.println("no argument constructor");
	}
	
	public void sample(This_keword t) {  //pass an argument in the method call
		System.out.println("parameterised method");
	}
	public void sample() {             //pass an argument in the method call
		sample(this);
		System.out.println("no argument method");
	}
	
	//this keyword 30min video
	public This_keword m() {  //return current class instance
		return this;
	}
	

	public static void main(String[] args) {
		This_keword obj = new This_keword();
		obj.exam(10);
		obj.display();
		obj.m1();
		obj.sample();
		System.out.println(obj.m());
		
		// TODO Auto-generated method stub

	}

}

//class  example{   //pass as argument in the constructor call
//	
//	example(test t){
//		System.out.println("inside the example method");
//	}
//}
//	
//class test {
//	
//	public void disp() {
//		
//		example obj = new example(this);
//		System.out.println("inside the test method");
//	}
//
//	public static void main(String[] args) {
//		test obj = new test();
//		obj.disp();
//		
//
//	}
//}
