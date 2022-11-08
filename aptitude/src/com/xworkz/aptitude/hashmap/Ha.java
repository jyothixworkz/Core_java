package com.xworkz.aptitude.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ha {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();

		Object put = map.put("malthesh", 124587);
		map.put("darshan", 142587);
		map.put("raghu", 54254);
		String name[]= {"d"};
		for(int i=0;i<name.length;i++) {
			
			for (Entry<String, Object> m : map.entrySet()) {
				if(m.getKey().contains(name[0])) {
					
					
					System.out.println(m);
				}
				
			}
			
		}

	}
}
