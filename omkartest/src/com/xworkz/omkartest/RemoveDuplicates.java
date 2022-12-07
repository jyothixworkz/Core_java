package com.xworkz.omkartest;

import java.util.TreeSet;

public class RemoveDuplicates {

//	5. Java Program to Remove Duplicate Entries from an Array using TreeSet
//	Input ; [Hello, hi, Wow, cute, thanks, hi, Aww, cute, hello, beloved, Aww]
//	Output : [Aww, Hello, Wow, baby, beloved, cute, hi, thanks] 

	public static void main(String[] args) {

		String[] array = { "Hello", "hi", "Wow", "cute", "thanks", "hi", "Aww", "cute", "hello", "beloved", "Aww" };

		TreeSet<String> treeSet = new TreeSet<String>();

		for (int i = 0; i < array.length; i++) {

			treeSet.add(array[i]);

		}
		System.out.println(treeSet);

	}

}
