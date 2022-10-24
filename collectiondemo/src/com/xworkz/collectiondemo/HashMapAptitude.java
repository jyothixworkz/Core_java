package com.xworkz.collectiondemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapAptitude {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		map.put("manoj", 1);
		map.put("jayanth", 2);
		map.put("jayaram", 3);
		map.put("jyothi", 4);
		System.out.println(map);
		
		String[] m= {"i"};
		for(int i=0;i<m.length;i++) {
			
			for(Entry<String, Integer> manoj:map.entrySet()) {
				
				if(manoj.getKey().contains(m[0])) {
					
					
					System.out.println(manoj.getKey()+" "+manoj.getValue());
				}
				
				
				
			}
			
			
			
		}
		
		
		
	}
	
	
	

}
