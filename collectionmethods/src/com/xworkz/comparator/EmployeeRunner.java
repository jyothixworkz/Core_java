package com.xworkz.comparator;

import java.util.TreeSet;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		   
		      Employeee employeee = new Employeee(1, "manoj", 25000);
		      Employeee employeee2 = new Employeee(2, "jayaram", 10000);
		      Employeee employeee3 = new Employeee(3, "darshan ", 25000);
		      
		       TreeSet<Object> treeSet = new TreeSet<>();
		       treeSet.add(employeee);
		       treeSet.add(employeee2);
		       treeSet.add(employeee3);
		       System.out.println(treeSet);
		       TreeSet treeSet2 = new TreeSet<>(new MyComparatorForEmployee());
		       
		       treeSet2.add(employeee);
		       treeSet2.add(employeee2);
		       treeSet2.add(employeee3);
		System.out.println(treeSet2);
		
		
	}

}
