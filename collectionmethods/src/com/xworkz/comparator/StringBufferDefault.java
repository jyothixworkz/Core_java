package com.xworkz.comparator;

import java.util.TreeSet;

public class StringBufferDefault {

	
	
	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet<>(new MyComparableStringBufer());
		
		
		treeSet.add(new StringBuffer("jdkkf"));
		treeSet.add(new StringBuffer("manoj"));
		treeSet.add(new StringBuffer("ashga"));
		
		System.out.println(treeSet);
		
	}
	
	
	
	
	
}
