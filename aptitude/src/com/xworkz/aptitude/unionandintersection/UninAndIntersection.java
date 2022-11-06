package com.xworkz.aptitude.unionandintersection;

import java.util.HashSet;

public class UninAndIntersection {

	public static void unionAndIntersection(int[] array1, int[] array2) {

		HashSet<Object> set = new HashSet<>();
		for (int i = 0; i < array1.length; i++) {

			set.add(array1[i]);
		}
		for (int j = 0; j < array2.length; j++) {

			set.add(array2[j]);
		}
		System.out.println(" union" + " " + set);
		set.clear();

		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		for (int j = 0; j < array2.length; j++) {
			if (set.contains(array2[j]))
				System.out.println(array2[j] + " ");
		}
	}

	public static void main(String[] args) {
		int[] one = { 1, 2, 3, 4, 8, 9 };
		int[] second = { 2, 5, 8, 7, 4, 1, 3, };
		unionAndIntersection(one, second);
	}

}
