package com.xworkz.aptitude.charposition;

import java.util.Scanner;

public class Char {

	public static int position(char value) {

		char upperCase = Character.toUpperCase(value);
		int asci = (int) upperCase;
		int position = asci - 64;
		return position;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" enter the char");
		char[] charArray = scanner.next().toCharArray();
		int position = position(charArray[0]);
		System.out.println(position);
	}
}
