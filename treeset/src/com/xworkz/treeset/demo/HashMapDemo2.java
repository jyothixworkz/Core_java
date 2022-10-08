package com.xworkz.treeset.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {
	public static void main(String[] args) {
		int[] unwanted= {1};
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
	
		hashMap.put(1, "manoj");
		hashMap.put(2, "nanja");
		hashMap.put(3, "boga");
//		for(int i=0;i<unwanted.length;i++) {
//			for (java.util.Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//				if(!entry.getKey().equals(unwanted[i])) {
//					System.out.println(entry.getKey()+"   "+entry.getValue());
//				}
//				
//			}
//		}
		System.out.println(hashMap);
		String[] s= {"ma","na"};
		 for(int i =0;i<s.length;i++) {
			 for (Entry<Integer, String> entry:hashMap.entrySet()) {
				 if(entry.getValue().contains(s[i])) {
					 System.out.println(entry.getKey()+"="+entry.getValue());
				 }
				
			}
		 }
	}
   
  
}
