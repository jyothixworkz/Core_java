package com.xworkz.aptitude.charposition;

import java.util.Scanner;

public class CharPositionDemo {

	static int position(char value) {

		char upperCase = Character.toUpperCase(value);
		int aski = (int) upperCase;
		int position = aski - 64;
		return position;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter the char value ");
		char charAt = scanner.next().charAt(0);
		int position = position(charAt);
		System.out.println(position);

	}

}
