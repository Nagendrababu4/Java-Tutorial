package encapsulation.java;

class Marks{
	
	private String name;
	private int maths;
	private int physics;
	private int chemistry;
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public void setmaths(int maths) {
		this.maths = maths;
	}
	public int getmaths() {
		return maths;
	}
	
	public void setphysics(int physics) {
		this.physics = physics;
	}
	public int getphysics() {
		return physics;
	}
	
	public void setchemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getchemistry() {
		return chemistry;
	}
	
	public void display() {
		int total = maths + physics + chemistry;
		int total_percentage = (total*100)/300;
		System.out.println("total percentage of "+ name +"is "+total_percentage);
	}
}
public class Encapsulation_ex {

	public static void main(String[] args) {
		Marks obj = new Marks();
		obj.setname("Anirudh");
		obj.setmaths(90);
		obj.setphysics(85);
		obj.setchemistry(80);
		System.out.println(obj.getname());
		System.out.println(obj.getmaths());
		System.out.println(obj.getphysics());
		System.out.println(obj.getchemistry());
		obj.display();
		
	}

}
