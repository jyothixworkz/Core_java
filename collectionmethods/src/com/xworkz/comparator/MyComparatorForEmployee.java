package com.xworkz.comparator;

import java.util.Comparator;

public class MyComparatorForEmployee implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Employeee employeee = (Employeee) o1;

		Employeee employeee2 = (Employeee) o2;
		
		String name = employeee.getName();
		 String name2 = employeee2.getName();
		 
		
		

		return name.compareTo(name2);
	}

}
