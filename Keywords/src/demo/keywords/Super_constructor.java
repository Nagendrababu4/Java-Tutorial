package demo.keywords;

class display{                  
	display(){               //by using constructor class
		
		System.out.println("inside the display constructor class");
	}
}
public class Super_constructor extends  display{
	Super_constructor(int a){
		
		super();          //  invoke parent class constructor using super keyword
		
		System.out.println("inside the Super_constructor class");
	
	}
//	Super_constructor(){
//		System.out.println("java");
//	}
	
	public static void main(String[] args) {
		Super_constructor obj = new Super_constructor(39);
	}
}
