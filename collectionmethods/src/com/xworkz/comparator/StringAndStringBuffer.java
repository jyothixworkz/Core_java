package com.xworkz.comparator;

import java.util.TreeSet;

public class StringAndStringBuffer {
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>(new MyComparatorForStringAndStringBuffer());
		set.add("manoj");
		set.add(new StringBuffer("jayanth"));
		set.add("sarath");
		set.add(new StringBuffer("yashu"));
		set.add("man");
		set.add(new StringBuffer("sokdar"));
		set.add("darshan");
		System.out.println(set);
		
	}

}
