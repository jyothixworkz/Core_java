package com.xworkz.name;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String string=(String)o1;
		String string2=(String)o2;
		
		
		
		
		return string2.compareTo(string);
	}

}
