package com.xworkz.collection;

import java.util.TreeSet;

public class ComparatorIntegerDemo {
	public static void main(String[] args) {
		TreeSet set= new TreeSet(new ComparatorIntegerDemoInt());
		 set.add(1);
		 set.add(5);
		 set.add(6);
		 set.add(15);
		 System.out.println(set);
	}

}
