package com.xworkz.collectionmethods;

import java.util.HashSet;

public class SetMethods {
	
	public static void main(String[] args) {
		  HashSet<Object> hashSet = new HashSet<>();
		  HashSet<Object> hashSet2 = new HashSet<>(200);
		  HashSet<Object> hashSet3 = new HashSet<>(10, 0.80f);
		     hashSet.add("manoj");
		     hashSet.add("pavan");
		     hashSet.add("jayanth");
		     hashSet.add("jayaram");
		     boolean add = hashSet.add("jayaram");
		     System.out.println(add);
		     System.out.println(hashSet);
	}

}
