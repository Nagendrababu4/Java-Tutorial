package collections.java;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_C {

	public static void main(String[] args) {
		TreeSet obj = new TreeSet();
		obj.add(40);
		obj.add(100);
		obj.add(200);
		obj.add(10);
		obj.add(30);
		obj.add(100);
		
		
		System.out.println(obj);
		
		Iterator itr = obj.iterator();
		
		while(itr.hasNext()) {
			System.out.println("ascending order: "+ itr.next()+'\n');
		}
//		
        Iterator itr_1 = obj.descendingIterator();
		
		while(itr_1.hasNext()) {
			System.out.println("descending order: "+itr_1.next());
		}

	}

}
