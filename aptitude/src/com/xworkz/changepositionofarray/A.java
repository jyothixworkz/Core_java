package com.xworkz.changepositionofarray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class A {
	static int pas=0;

	public static void p(int[] value) {

ArrayList<Object> list = new ArrayList<>();

		for (int i = 0; i < value.length; i++) {
			boolean add = list.add(value[i]);

		}
		System.out.println(list);
		for(int i=1;i<3;i++) {
			
			
			Object set = list.set(i-1, value[value.length-i]);
			list.set(value.length-i, value[pas]);
			pas++;
		}
		System.out.println(list);
		

	}
	public static void main(String[] args) {
		
		int [] value= {1,2,3,4,5,6,7,8,9};
		p(value);
	}

}
