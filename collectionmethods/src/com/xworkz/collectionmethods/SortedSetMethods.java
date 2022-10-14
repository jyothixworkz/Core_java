package com.xworkz.collectionmethods;

import java.util.TreeSet;

public class SortedSetMethods {
	
	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<>();
	
		set.add("manoj");
		set.add("jaya");
		set.add("maya");
		set.add("mah");
		set.add("thirga");
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("thirga"));
		System.out.println(set.tailSet("soya"));
		System.out.println(set.subSet("jaya", "thirga"));
		System.out.println(set.comparator());
		
		
	}

}
