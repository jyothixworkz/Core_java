package com.xworkz.aptitude.unionandintersection;

import java.util.HashSet;

public class UAndI {
	public static void unionAndInteraction(int[] array1, int[] array2) {
		HashSet<Object> hashSet = new HashSet<>();
		for (int i = 0; i < array1.length; i++) {
			hashSet.add(array1[i]);
		}
		for (int i = 0; i < array2.length; i++) {
			hashSet.add(array2[i]);
		}
		System.out.println(hashSet);
		hashSet.clear();
		for (int i = 0; i < array1.length; i++) {
			hashSet.add(array1[i]);
		}
		for (int i = 0; i < array2.length; i++) {
			if (hashSet.contains(array2[i])) {

				System.out.print(array2[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, };
		int[] array2 = { 1, 5, 3, 4, 78, 125 };
		unionAndInteraction(array2, array1);
	}

}
