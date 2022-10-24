package com.xworkz.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args, Object String) {
		HashMap<String,Integer> hashMap = new HashMap<>();
		
		hashMap.put("manoj", 1);
		hashMap.put("saratha", 15);
		hashMap.put("mallu", 10);
		String[] m= {"m"};
		
		for(int i =0;i<m.length;i++) {
			
			for(Entry<String, Integer> manoj:hashMap.entrySet()) {
				System.out.println(manoj.getKey()+" "+manoj.getValue());
				if (manoj.getKey().contains(m[0])) {
					System.out.println(manoj.getKey()+manoj.getValue());
				}
			
			}
			
			
			
		}
		
		
		
		
	}

}
