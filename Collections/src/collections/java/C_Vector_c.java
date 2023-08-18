package collections.java;

import java.util.Vector;

public class C_Vector_c {

	public static void main(String[] args) {
		
		Vector obj = new Vector();
		
		obj.addElement("name");
		obj.add(10);
		obj.add("college");
		obj.add(100);
		obj.add(null);
		obj.addElement("college");
		
		System.out.println(obj);
		obj.removeElement("name");
		System.out.println(obj);
		
		obj.addElement("Anirudh");
		System.out.println(obj);
		System.out.println(obj.firstElement());
		System.out.println(obj.lastElement());
		System.out.println(obj.capacity());
		obj.removeAllElements();
		System.out.println(obj);
		
		
		

	}

}
