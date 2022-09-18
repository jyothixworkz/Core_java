package com.xworkz.treeset.demo;

import java.util.TreeSet;

public class CompareToMethod {
	public static void main(String[] args) {

		System.out.println("a".compareTo("z"));
		System.out.println("z".compareTo("k"));
		System.out.println("a".compareTo("a"));
		//System.out.println("a".compareTo(null));
	TreeSet set = new TreeSet();
	set.add("a");
	set.add("z");
	System.out.println(set);
	}

}
