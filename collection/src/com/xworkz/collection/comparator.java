package com.xworkz.collection;

import java.util.TreeSet;

public class comparator  {
	
	
	public static void main(String[] args) {
		TreeSet< String> objects= new TreeSet<String>(new ComparatorDemo());
		objects.add("manoj");
		objects.add("mall");
		objects.add("raghu");
		objects.add("abhi");
		objects.add("basu");
		System.out.println(objects);
	}
	
	

}
