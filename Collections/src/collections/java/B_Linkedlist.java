package collections.java;

import java.util.Iterator;

import java.util.LinkedList;

public class B_Linkedlist {

	public static void main(String[] args) {
		
		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add("college");
		obj.add("java");
		obj.add(2.45f);
		obj.add(100);
		obj.add(10);
		obj.add(null);
		
		System.out.println(obj);
		
		Iterator itr = obj.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
