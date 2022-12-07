package com.xworkz.omkartest;

import java.util.ArrayList;

public class OddAndEven {
//	3. Java code to separate odd and even numbers in an array

//	 Input : {20,37,58,69,99,70,87,18,9}
//	 Output : even= {20,58,70,18} , odd = {37,69,99,87,9}

	public static void main(String[] args) {
		int[] array = { 20, 37, 58, 69, 99, 70, 87, 18, 9 };

		ArrayList arrayList1 = new ArrayList();
		ArrayList arrayList2 = new ArrayList();

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {

				arrayList1.add(array[i]);

			} else {

				arrayList2.add(array[i]);
			}

		}
		System.out.println(arrayList1);
		System.out.println(arrayList2);

	}
}
