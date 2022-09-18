package com.xworkz.collection;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s = (String) o1;
		String s1 = (String) o2;

		return s1.compareTo(s);
	}

}
