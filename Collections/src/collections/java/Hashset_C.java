package collections.java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_C {

	public static void main(String[] args) {
		HashSet obj = new HashSet();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		System.out.println(obj);
		
		Iterator itr = obj.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
