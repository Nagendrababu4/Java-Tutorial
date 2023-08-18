package collections.java;

import java.util.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap_HashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> obj = new LinkedHashMap<>();
		obj.put(1, "CSE");
		obj.put(2, "ECE");
		obj.put(3, "IT");
		obj.put(4, "CIVIL");
		obj.put(5,  "MECH");
		obj.put(null, null);
		System.out.println(obj);
		
		HashMap<String, String> obj1 = new HashMap<>();
		obj1.put("Name", "Anirudh");
		obj1.put("age", "1");
		obj1.put("city", "Bangaluru");
		obj1.put("country", "India");
		obj1.put(null, null);
		System.out.println(obj1);
		}
	}
