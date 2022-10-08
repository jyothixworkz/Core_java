package com.xworkz.treeset.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	/*	  TreeSet set = new TreeSet();
		  set.add("a");
		  set.add("b");
		  set.add("b");
		  set.add("z");
		  set.add("l");
		 // set.add(new Integer(10));
		 // set.add(null);
		  System.out.println(set);*/
		Map<String, Integer> items = new HashMap<String, Integer>();

	    String[] unwanted = {"bl"};

	    items.put("black shoes", 1);
	    items.put("light coat", 10);
	    items.put("white shoes", 40);
	  //  items.put("dark coat", 90);

	    for(int i = 0; i < unwanted.length; i++) {
	        for(Entry<String, Integer> entry : items.entrySet()) {
	            if(!entry.getKey().contains(unwanted[i])) {
	                System.out.println(entry.getKey() + " = " + entry.getValue());
	            }
	        }
	    }
			
		}
	}


