package com.xworkz.aptitude.charposition;

import java.util.Scanner;

public class CharPosDemo {

	public static int position(char value) {

		char upperCase = Character.toUpperCase(value);
		int asci = (int) upperCase;
		int position = asci - 64;
		return position;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the char value");
		char[] charAt = scanner.next().toCharArray();
		int position = position(charAt[0]);

		System.out.println(position);

	}

}
