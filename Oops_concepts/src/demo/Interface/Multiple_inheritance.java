package demo.Interface;

interface agriculture{
	void land();
}
interface fields{
	void land1();
	
}
class farmers implements agriculture,fields {

	public void land() {
			System.out.println("Red soil: mirchi fields, cotton fields, fruits");
	}
	public void land1() {
		System.out.println("Black soil: paddy fields, bengal gram fields, tobacco");
	}
	
}
public class Multiple_inheritance {

	public static void main(String[] args) {
		System.out.println("......interface using muliple inheritance......");
		farmers obj = new farmers();
		obj.land();
		obj.land1();

	}

}
