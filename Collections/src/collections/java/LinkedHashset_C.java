package collections.java;

import java.util.LinkedHashSet;

public class LinkedHashset_C {

	public static void main(String[] args) {
		LinkedHashSet obj = new LinkedHashSet();
		obj.add("name");
		obj.add("age");
		obj.add("number");
		obj.add("address");
		obj.add("mail");
		
		obj.add("address");
		obj.add("age");
		obj.add(null);
		
		System.out.println(obj);

	}

}
