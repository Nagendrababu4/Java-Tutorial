package collections.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_C {
	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap<>();
		obj.put(1, "C");
		obj.put(2, "C++");
		obj.put(3, "Java");
		obj.put(4, "Python");
		obj.put(5, "Java script");
		obj.put(6, "HTML,CSS");
		obj.put(4, "GO");
		obj.put(20, "Java");
		obj.put(null, null);
		obj.put(10, null);
		
		System.out.println(obj);
		obj.remove(5);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.remove(6, "HTML,CSS");
		System.out.println(obj);
		System.out.println(obj.keySet());
		System.out.println("HashMap: "+obj);
		
		Set set = obj.entrySet();
		System.out.println("Set: "+set);
		
		for(Map.Entry a : obj.entrySet()) {
			System.out.println(a.getKey()+": "+a.getValue());
		}
	}
}
