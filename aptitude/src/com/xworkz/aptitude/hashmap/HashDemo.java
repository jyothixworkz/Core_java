package com.xworkz.aptitude.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashDemo {
	public static void main(String[] args) {

		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("manthya", 1520);
		hashMap.put("sunthya", 254742);
		hashMap.put("sthya", 154722);

		String unwanted[] = { "s" };
		for (int i = 0; i < unwanted.length; i++) {

			for (Entry<String, Object> entry : hashMap.entrySet()) {
				if (entry.getKey().contains(unwanted[0])) {

					System.out.println(entry);

				}

			}
		}

	}

}
