package encapsulation.java;

class test{
	private int a;
	private String name;
	
	public void setno(int a) {
		this.a=a;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getno() {
		return a;
	}
	public String getname() {
		return name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		test obj = new test();
		obj.setno(10);
		obj.setname("hari");
		System.out.println(obj.getno());
		System.out.println(obj.getname());

	}

}
