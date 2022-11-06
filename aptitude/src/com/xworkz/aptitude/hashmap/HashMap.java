package com.xworkz.aptitude.hashmap;

import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<String, Object> hashMap = new java.util.HashMap<String, Object>();

		Object put = hashMap.put("manoj", 25);
		hashMap.put("mangya", 85);
		hashMap.put("sowmya", 74);
		String[] unwanted = { "g" };
		for (int i = 0; i < unwanted.length; i++) {
			for (Entry<String, Object> string : hashMap.entrySet()) {
				if (!string.getKey().contains(unwanted[i])) {

					System.out.println(string);

				}

			}
		}

	}

}
