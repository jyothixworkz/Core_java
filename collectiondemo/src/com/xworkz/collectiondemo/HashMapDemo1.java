package com.xworkz.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("manoj", 1);
		map.put("malateh", 9);
		map.put("sarath", 25);
		System.out.println(map);

		String[] name = { "s" };

		for (int i = 0; i < name.length; i++) {
			for (Entry<String, Object> string : map.entrySet()) {
				if (string.getKey().contains(name[0])) {
					System.out.println(map);
					System.out.println(string.getKey() + " " + string.getValue());

				}

			}
		}

	}

}
