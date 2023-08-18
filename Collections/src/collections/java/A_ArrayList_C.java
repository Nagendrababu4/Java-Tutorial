package collections.java;

import java.util.ArrayList;

public class A_ArrayList_C {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(2);
		obj.add("Anirudh");
		obj.add('N');
		obj.add(1.45f);
		
		obj.add(1.4);
		obj.add("Anirudh");
		obj.add(null);
		System.out.println("Arraylist: "+obj);
		
		obj.remove(1.4);
		obj.remove("Anirudh");
		
		ArrayList obj1 = new ArrayList(obj);
		System.out.println("new arraylist: "+obj1);
		
		obj.removeAll(obj1);
		System.out.println("clear: "+obj);
		

	}

}

