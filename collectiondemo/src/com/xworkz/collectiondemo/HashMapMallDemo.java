package com.xworkz.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapMallDemo {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap();
		map.put("manoj", 25);
		map.put("mal", 24);
		map.put("sathya", 10);
		System.out.println(map);
		String[] unwanted = { "y" };
		for (int i = 0; i < unwanted.length; i++) {
			for (Entry<String, Object> string : map.entrySet()) {
				if (!string.getKey().contains(unwanted[0])) {
                  // System.out.println(map);
                   System.out.println(string);
				//	System.out.println(string.getKey() + " " + string.getValue());
				}

			}

		}

	}

}
