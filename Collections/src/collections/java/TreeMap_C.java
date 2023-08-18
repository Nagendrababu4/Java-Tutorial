package collections.java;

import java.util.TreeMap;

public class TreeMap_C {

	public static void main(String[] args) {
		TreeMap<Character, String> tree = new TreeMap<>();
		tree.put('H', "Hyderabad");
		tree.put('B', "Bangalore");
		tree.put('C', "Chennai");
		tree.put('O', "Ongole");
		tree.put('M', "Mysure");
		tree.put('M', "Mysure");
		tree.put('A', null);
		try {
			tree.put(null, "Goa");
		}
		catch(NullPointerException e) {
			System.out.println("Exception Handling: "+e+'\n');
		}
		System.out.println(tree);
		System.out.println(tree.keySet());	
	}
}
