package collections.java;

import java.util.ArrayList;

public class Generics_C {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(40);
		obj.add(100);
		obj.add(4);
		obj.add(1000);
		
		System.out.println(obj);
		
		int num =(int) obj.get(1);
		System.out.println(num);
		
		System.out.println('\n'+"..using for loop to iterate the values..");
		
		for (int i:obj) {
			System.out.println(i);
		}
	}
}
