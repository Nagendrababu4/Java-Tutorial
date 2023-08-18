package Collections.java;

import java.util.Vector;

public class vector_C {

	public static void main(String[] args) {
		Vector obj = new Vector();
		obj.add("asdg");
		obj.add(123);
		obj.add(6);
		obj.addElement("aerg");
		System.out.println(obj);
		
		obj.removeElement("aerg");
		obj.addElement("Rishika");
		System.out.println(obj);
		obj.removeAllElements();
		System.out.println("no values");

	}

}
