package demo.Interface;

class A  //combination of single and Multiple Inheritance 
{
   public void display()
   {
     System.out.println("Method defined inside A class");
   }
}
interface B
{
 public void show();
}
interface C
{
 public void show();
}

public class Hybrid_inheritance extends A implements B,C {  
	public void show() {
		System.out.println("interfaces A and B");	
	}
	public static void main(String[] args) {
		System.out.println(".....Hybrid inheritance......");
		Hybrid_inheritance obj = new Hybrid_inheritance();
		obj.display();
		obj.show();

	}
}

//  .....Hybrid inheritance can execute using multiple inheritance types........
//1. Hybrid Inheritance in Java using Single and Multiple Inheritance.
//2. Hybrid Inheritance in Java using Multilevel and Hierarchical Inheritance.
//3. Hybrid Inheritance in Java using Hierarchical and Single Inheritance
//4. Hybrid Inheritance in Java using Multiple and Multilevel Inheritance