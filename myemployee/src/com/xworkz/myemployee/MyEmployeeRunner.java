package com.xworkz.myemployee;

import java.util.TreeSet;

public class MyEmployeeRunner {
	public static void main(String[] args) {
		MyEmployee myEmployee = new MyEmployee(10, "manoj");
		MyEmployee myEmployee2 = new MyEmployee(1, "manja");
		MyEmployee myEmployee3 = new MyEmployee(80, "darshan");
		MyEmployee myEmployee4 = new MyEmployee(6, "jayaram");
		TreeSet treeSet = new TreeSet();
		treeSet.add(myEmployee);
		treeSet.add(myEmployee2);
		treeSet.add(myEmployee3);
		treeSet.add(myEmployee4);
		System.out.println(treeSet);
	}

}
