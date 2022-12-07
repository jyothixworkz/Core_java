package com.xworkz.omkartest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfArray {
//	10. Write a Java program to find the intersection of two arrays? 
//			input: a[] = {1,4,5,9,10} b[]= {2,8,6,1,7,4} 
//	Output :intersection = {1,4} 

	public static List intersectionOfArray(Integer[] a, Integer[] b) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			hashSet.add(a[i]);

		}

		for (int i = 0; i < b.length; i++) {
			if (hashSet.contains(b[i])) {

				arrayList.add(b[i]);

			}

		}
		return arrayList;

	}

	public static void main(String[] args) {

		Integer[] A = { 1, 4, 5, 9, 10 };
		Integer[] B = { 2, 8, 6, 1, 7, 4 };

		List list = intersectionOfArray(A, B);
		System.out.println(list);
		Object[] array = list.toArray();
		System.out.println(array[0] + " " + array[1]);

	}

}
