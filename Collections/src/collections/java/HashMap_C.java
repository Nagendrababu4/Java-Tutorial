package collections.java;

import java.util.HashMap;

public class HashMap_C {

	public static void main(String[] args) {
		
		HashMap<String,String> obj = new HashMap<>();
		
		System.out.println("....HashMap...."+'\n');
		
		obj.put("TATA", "Nexon"+'\n');
		obj.put("Morris Garages(MG)", "Astor"+'\n');
		obj.put("KIA", "Seltos"+'\n');
		obj.put("Mahindra", "Thor, VUV"+'\n');
		obj.put("Toyota", "Fortuner"+'\n');
		
		System.out.println(obj);
		
	}
}
