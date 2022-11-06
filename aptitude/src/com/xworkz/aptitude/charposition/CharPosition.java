package com.xworkz.aptitude.charposition;

import java.util.Scanner;

public class CharPosition {

	static int position(char value) {

		char lowerCase = Character.toLowerCase(value);

		int asciValue = (int) lowerCase;

		int position = asciValue - 96;
		return position;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name ");
		char charAt = scanner.next().charAt(0);

		int position = position(charAt);
		System.out.println(position);

	}

}
