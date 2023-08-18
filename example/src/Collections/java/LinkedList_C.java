package Collections.java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_C {

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.add(123);
		obj.add("Anirudh");
		obj.add("Rishika");
		
		System.out.println(obj);
		
        Iterator itr = obj.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
