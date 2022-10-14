package com.xworkz.comparator;

import java.util.Comparator;

public class MyComparatorForStringAndStringBuffer implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String string=o1.toString();
		String string2 =o2.toString();
			int length = string.length();
			int length2 = string2.length();
			if(length<length2)
				return -1;
			else if(length>length2)
			return +1;
			else 
				return string.compareTo(string2);
		
		//return 0;
	}

}
