package com.xworkz.mystudent;

import java.util.TreeSet;

public class MyStudentRunner {
	public static void main(String[] args) {
		MyStudent l = new MyStudent(100, "manoj");
		MyStudent myStudent = new MyStudent(98, "jayaram");
		MyStudent l2= new MyStudent(55, "nandan");
		MyStudent myStudent2 = new MyStudent(500, "latha");
		MyStudent myStudent3 = new MyStudent(55, "sowmya");
		TreeSet treeSet = new TreeSet();
		treeSet.add(myStudent);
		treeSet.add(l);
		treeSet.add(myStudent2);
		treeSet.add(myStudent3);
		treeSet.add(l2);
		System.out.println(treeSet);
		
	}

}
