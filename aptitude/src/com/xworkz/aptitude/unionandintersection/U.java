package com.xworkz.aptitude.unionandintersection;

import java.util.HashSet;

public class U {

	static void uAndI(int[] array, int[] array2) {

		HashSet<Object> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {

			boolean add = set.add(array[i]);

		}
		for (int i = 0; i < array2.length; i++) {

			boolean add = set.add(array2[i]);

		}
		System.out.println(set);
		set.clear();
		
		
		for (int i = 0; i < array.length; i++) {

			boolean add = set.add(array[i]);

		}
		
		for (int i = 0; i < array2.length; i++) {

			if(set.contains(array2[i])) {
				
				
				System.out.println(array2[i]);
			}

		}
		
		
		

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 3, 5, 6, 89, 456 };
		uAndI(array, array2);
	}

}
