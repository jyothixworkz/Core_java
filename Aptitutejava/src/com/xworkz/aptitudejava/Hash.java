package com.xworkz.aptitudejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hash {
	public static void main(String[] args) {
		
		
		
		HashMap<String , Object> map = new HashMap<String , Object>();
		
		 map.put("manoj", 25);
		 map.put("jyothi", 15);
		 map.put("vayasu", 18);
		 
		 
		 String[] name= {"v"};
		 for(int i=0; i<name.length;i++) {
			 for (Entry<String, Object> string : map.entrySet()) {
				 
				 if(!string.getKey().contains(name[0])) {
					 
					 
					 System.out.println(string);
				 }
				 
				 
				
			}
			 
			 
			 
		 }
		
		
	}

}
