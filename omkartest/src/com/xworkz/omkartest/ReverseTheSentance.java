package com.xworkz.omkartest;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheSentance {
//	1. Write a java program to reverse a given String , without using reverse
//	method
//	Input: = “getting good at coding needs a lot of practice”
//	Output: = “practice of lot a needs coding at good getting”

	public static void main(String[] args) {

		String inputString = "getting good at coding needs a lot of practice";

		String[] split = inputString.split(" ");

		ArrayList<Object> arrayList = new ArrayList<>();
		for (int i = 0; i < split.length; i++) {

			arrayList.add(split[i]);

		}

		arrayList.sort(new MyComparator());
		System.out.println(arrayList);
		String string = arrayList.toString();
		System.out.println(string);

	}

}
