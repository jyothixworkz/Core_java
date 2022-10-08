package com.xworkz.treeset.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		 Map<String,Integer> hashMap = new HashMap<String,Integer>();
		 hashMap.put("manoj", 1);
		 hashMap.put("ganga", 5);
		 hashMap.put("jayanth", 2);
		 String[] unwanted= { "ja"};
		 
		 for(int i=0;i<unwanted.length;i++) {
			 
			 for ( Entry<String, Integer> m : hashMap.entrySet()) {
				 if(!m.getKey().contains(unwanted[0])) {
					 System.out.println(m.getKey()+"="+m.getValue());
				 }
				
			}
			 
			 
		 }
		 
		
		
		
		
	}

}
