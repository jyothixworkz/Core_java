package com.xworkz.aptitude.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("manoj", 1425);
		map.put("sathya", 1145248425);
		map.put("sowmya", 1245896);
		map.put("sowmya", 1245896);
		
		String[] name = { "s" };

		for (int i = 0; i < name.length; i++) {

			for (Entry<String, Object> string : map.entrySet()) {
				if(string.getKey().contains(name[0])) {
				System.out.println(string);
				}
			}
		}

	}

}
