package demo.abstraction;
abstract class calculator{
	abstract void calculate(int a, int b);
}
class addition extends calculator{

	void calculate(int a, int b) {
		int x = a+b;
		System.out.println("addiction of two numbers is: "+x);
	}
}
class subtraction extends calculator{

	void calculate(int a, int b) {
		int x = a-b;
		System.out.println("subtraction of two numbers is: "+x);
	}
}
class multiplication extends calculator{

	void calculate(int a, int b) {
		int x = a*b;
		System.out.println("multiplication of two numbers is: "+x);
	}
}
class division extends calculator{

	void calculate(int a, int b) {
		int x = a/b;
		System.out.println("division of two numbers is: "+x);
	}
}
class modulus extends calculator{

	void calculate(int a, int b) {
		int x = a%b;
		System.out.println("modulus of two numbers is: "+x);
	}
}
public class Abstraction_example {
	public static void main(String[] args) {
		System.out.println("......Welcome to the Basic calculator......");
		addition obj1 = new addition();
		obj1.calculate(20,12);
		subtraction obj2 = new subtraction();
		obj2.calculate(20,12);
		multiplication obj3 = new multiplication();
		obj3.calculate(20,12);
		division obj4 = new division();
		obj4.calculate(20,12);
		modulus obj5 = new modulus();
		obj5.calculate(20,12);
	}
}