package com.xworkz.aptitude.charposition;

import java.util.Scanner;

public class C {
	public static int pos(char value) {

		char upperCase = Character.toUpperCase(value);
		int ascci = (int) upperCase;
		int pos = ascci - 64;
		return pos;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the char ");
		char[] charArray = scanner.next().toCharArray();
		         int pos = pos(charArray[0]);
		         System.out.println(pos);
	}

}
