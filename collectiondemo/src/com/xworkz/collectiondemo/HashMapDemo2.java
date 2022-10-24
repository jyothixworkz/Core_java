package com.xworkz.collectiondemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap();
		hashMap.put("manoj", 1);
		hashMap.put("manya", 20);
		hashMap.put("anyapa", 85);

		String[] string = { "p" };
		for (int i = 0; i < string.length; i++) {
			for (Entry<String, Object> string2 : hashMap.entrySet()) {
				if (string2.getKey().contains(string[0])) {
					System.out.println(string2);
                    //System.out.println(string2.getKey());
					// System.out.println(string2.getKey() + " " + string2.getValue());
				}
			}

		}

	}

}
