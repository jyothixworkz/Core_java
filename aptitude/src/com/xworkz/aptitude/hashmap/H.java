package com.xworkz.aptitude.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class H {
	public static void main(String[] args) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("mangya", 1245);
		map.put("sathya", 12345875);
		map.put("sanjay", 123456);

		String name[] = { "s" };
		for (int i = 0; i < name.length; i++) {

			for (Entry<String, Object> string : map.entrySet()) {

				if (string.getKey().contains(name[0])) {

					System.out.println(string);
				}
				else {
					
					System.out.println(string+":this is eliminated");
				map.remove(string.getKey());
				}

			}

		}
		System.out.println(map);

	}

}
