package com.xworkz.stringclass;

import java.util.Scanner;

public class CharPosition {

	static int findPosition(char value) {

		char upperCase = Character.toUpperCase(value);

		int asciValue = (int) upperCase;
		int position = asciValue - 64;
		return position;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter the value");
		char next = scanner.next().charAt(0);

		int findPosition = findPosition(next);
		System.out.println(findPosition);

	}
	

}
