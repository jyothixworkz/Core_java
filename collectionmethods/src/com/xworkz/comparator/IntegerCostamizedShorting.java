package com.xworkz.comparator;

import java.util.Set;
import java.util.TreeSet;

public class IntegerCostamizedShorting {
	
	
	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet<>(new MyComparator());
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(45);
		treeSet.add(20);
		treeSet.add(64646);
		System.out.println(treeSet);
		
		
		
		
	}

}
