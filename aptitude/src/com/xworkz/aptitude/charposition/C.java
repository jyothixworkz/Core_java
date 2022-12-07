package com.xworkz.aptitude.charposition;

import java.util.LinkedList;
import java.util.List;

public class C {
	public static int pos(char value) {
		char upperCase = Character.toUpperCase(value);
		int ascci = (int) upperCase;
		int pos = ascci - 64;
		return pos;
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the char ");
//		char[] charArray = scanner.next().toCharArray();
//		         int pos = pos(charArray[0]);
//		         System.out.println(pos);
		List list = new LinkedList();// c /l// l
		Integer i = new Integer(3);
		boolean add = list.add(1);
		boolean add2 = list.add(2);
		boolean add3 = list.add(i);

		Object remove = list.remove(i);

		System.out.println(remove);
		System.out.println(list);

	}
}
