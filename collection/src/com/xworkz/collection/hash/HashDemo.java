package com.xworkz.collection.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashDemo {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		Object put = map.put("manoj", new Integer(25));
		Object put2 = map.put("manoj", 2);
		map.put("kumar", 45);
		map.put("om", 4512);
		// System.out.println(put);
		System.out.println(put2);
		System.out.println(map);

		String unwanted[] = { "k" };
		for (int i = 0; i < unwanted.length; i++) {

			for (Entry obj : map.entrySet()) {
				if (!(((String) obj.getKey()).contains(unwanted[0]))) {
					System.out.println(obj);
				}

			}

		}

	}

}
