package com.xworkz.changepositionofarray;

import java.util.ArrayList;

public class Apos {
	static int value=0;

	public static void change(int[] array) {

		ArrayList<Object> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {

			list.add(array[i]);
		}
		System.out.println(list);
		for(int i=1 ; i<3;i++) {
			
			list.set(i-1, array[array.length-i]);
			list.set(array.length-i, array[value]);
			value++;
			
		}
		System.out.println(list);

	}
	public static void main(String[] args) {
		 int [] array= {1,2,3,4,5,6,7,8,9};
		 change(array);
	}

}
