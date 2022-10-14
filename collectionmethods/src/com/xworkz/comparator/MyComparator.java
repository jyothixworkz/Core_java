package com.xworkz.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer integer=(Integer)o1;
		Integer integer2=(Integer)o2;
		if(integer<integer2) {
			return 1;
		}
		else if(integer>integer2) {
			return -1;
		}
		
		
		
		
		return 0;
	}

}
