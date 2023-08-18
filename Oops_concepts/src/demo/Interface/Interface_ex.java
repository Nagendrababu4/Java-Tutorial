package demo.Interface;

interface Drawable{
	
	void draw();
}

class triangle implements Drawable{
	
	@Override
	public void draw() {
		System.out.println("draw triange");
		
	}
}
public class Interface_ex {

	public static void main(String[] args) {
		triangle obj = new triangle();
		obj.draw();
		// TODO Auto-generated method stub

	}

}
