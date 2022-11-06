package com.xworkz.aptitude.unionandintersection;

import java.util.HashSet;

public class UnionAndInteraction {

	public static void unionAndInteraction(int[] array1, int[] array2) {

		HashSet<Object> set = new HashSet<Object>();
		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);

		}
		for (int j = 0; j < array1.length; j++) {
			set.add(array2[j]);

		}
		System.out.println(set);
		set.clear();
		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);

		}
		for (int j = 0; j < array2.length; j++) {
			if(set.contains(array2[j])) {
				
				
				System.out.println(array2[j]);
				
			}

		}
		System.out.println(set);
		

	}

	public static void main(String[] args) {
		int[] num = { 1, 3, 5, 7, 9 };
		int[] num2 = { 2, 4, 6, 8, 1, 3 };
		unionAndInteraction(num, num2);
	}

}
