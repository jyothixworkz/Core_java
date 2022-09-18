package com.xworkz.collection;

import java.util.Comparator;

public class ComparatorIntegerDemoInt implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer integer = (Integer) o1;
		Integer integer2 = (Integer) o2;

		return integer2.compareTo(integer);
	}

}
