package final_keyword;

class keyword{
	final void m() {
		
	}
}
public class Final_keyword extends keyword {
	void m() {                                 //method using final keyword
	}
	
	public static void main(String[] args) {
		final int a = 10;
		a+=20;                                 //variable using final keyword
		System.out.println(a);
		
	}

}





//class weekend1{
//	final void keyword() {
//		System.out.println("today is saturday");
//	}
//}
//final class weekend2 extends weekend1{
//	void keyword() {                              //method using final keyword
//		System.out.println("today is sunday");
//	}
//}
//public class Final_keyword extends weekday {   //class using final keyword
//	void keyword() {
//		System.out.println("inside final keyword");
//	}
//
//	public static void main(String[] args) {
////		final  int a = 19;                          //variable using final keyword
//		
//		final int a = 19;                      
//		a+=29;
//		System.out.println(a);
//		
////		Final_keyword obj = new Final_keyword();
////		obj.keyword();
//	}
//
//}
