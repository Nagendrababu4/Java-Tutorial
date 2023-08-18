package demo.abstraction;

abstract class mobile {
	public abstract void m_feature();
	
	public mobile(){
		System.out.println("mobile brands");
	}
}
class Vivo extends mobile{
	public void m_feature() {
		System.out.println("Vivo contain: "+"v,x series");
	}
}

class Iqoo extends mobile{

	@Override
	public void m_feature() {
		System.out.println("Iqoo contains: "+"z series");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		Vivo obj = new Vivo();
		obj.m_feature();
		
		Iqoo obj1 = new Iqoo();
		obj1.m_feature();
	}
}

//abstraction: It shows essential attributes and hides unnecessary things.
 