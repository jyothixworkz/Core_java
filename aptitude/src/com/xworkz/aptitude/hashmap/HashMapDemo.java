package com.xworkz.aptitude.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		
		hashMap.put("manoj", 42);
		hashMap.put("chidu", 45);
		hashMap.put("sarath", 0213);
		System.out.println(hashMap);
		 String[] unwanted= {"h"};
		 
		
		for(int i=0; i<unwanted.length;i++) {
			for (Entry<String, Object> string : hashMap.entrySet()) {
				if(string.getKey().contains(unwanted[i]))	{
					System.out.println(string);
				}
				//System.out.println(string);
			}
			
		}
		
	}

}
