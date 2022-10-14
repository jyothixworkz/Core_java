package com.xworkz.comparator;

import java.util.Comparator;

public class MyComparableStringBufer  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String string = o1.toString();
		String string2=o2.toString();
		
		
		
		return string.compareTo(string2)
				;
	}

	
	

}
