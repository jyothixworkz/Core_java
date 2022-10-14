package com.xworkz.comparator;

import java.util.TreeSet;

public class StringCustamisedOrder {

	
	
	
	public static void main(String[] args) {
		 TreeSet treeSet = new TreeSet<>(new MyComparatorString());
		     treeSet.add("a");
		     treeSet.add("manoj");
		     treeSet.add("jaya");
		     treeSet.add("maya");
		     treeSet.add("sos");
		     treeSet.add("soya");
		     treeSet.add("mangya");
		     treeSet.add("thungya");
		     System.out.println(treeSet);
	}
}
