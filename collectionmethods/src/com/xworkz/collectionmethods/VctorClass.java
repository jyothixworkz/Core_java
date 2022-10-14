package com.xworkz.collectionmethods;

import java.util.Stack;
import java.util.Vector;

public class VctorClass {
	public static void main(String[] args) {
		
		
		 Vector stack = new Vector();// initial cap is 10 and once it is full inc double
		
		Vector<Object> vector = new Vector<>(2000);// it will give customised cap 
		new Vector<>(1000, 200);// it will give  cus init cap and cust increment cap
		vector.addElement("lscyuqw");
		System.out.println(vector.capacity());
		
		System.out.println(stack.capacity());
	}

}
