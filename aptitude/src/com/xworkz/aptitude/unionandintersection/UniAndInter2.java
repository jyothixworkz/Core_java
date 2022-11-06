package com.xworkz.aptitude.unionandintersection;

import java.util.HashSet;

public class UniAndInter2 {

	public static void unionAndIntersection(int[] array1, int[] array2) {

		HashSet<Object> set = new HashSet<>();
		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		for (int j = 0; j < array2.length; j++) {
			set.add(array2[j]);

		}
		System.out.println(set);
		set.clear();
		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		for (int i = 0; i < array2.length; i++) {
			if (set.contains(array2[i])) {
				System.out.println(array2[i]);
			}
		}

	}

	public static void main(String[] args) {

		int[] one = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		int[] second = { 1, 3, 5, 6, 7, 8, 9, };
		unionAndIntersection(one, second);
	}

}
