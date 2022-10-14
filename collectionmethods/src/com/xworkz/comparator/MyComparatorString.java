package com.xworkz.comparator;

import java.util.Comparator;

public class MyComparatorString implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String string=(String)o1;
		String string2=(String)o2;
		
		return -string.compareTo(string2);
	}
	

}
