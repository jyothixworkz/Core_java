package com.xworkz.name;

import java.util.TreeSet;

public class Name {
	public static void main(String[] args) {
		 TreeSet treeSet = new TreeSet(new MyComparator());
		 treeSet.add("manoj");
		 treeSet.add("jayanth");
		 treeSet.add("jayaram");
		 treeSet.add("nandan");
		 treeSet.add("latha");
		 System.out.println(treeSet);
		 System.out.println("jayanth".compareTo("jayaram"));
		
	}
	

}
