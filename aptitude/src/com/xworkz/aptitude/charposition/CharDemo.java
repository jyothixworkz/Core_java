package com.xworkz.aptitude.charposition;

import java.util.Optional;
import java.util.Scanner;

public class CharDemo {

	static Optional<Integer> position(char value) {

		char upperCase = Character.toUpperCase(value);
		int aski = (int) upperCase;
		int position = aski - 64;

		return Optional.of(position);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the char");
		char[] cs = scanner.next().toCharArray();
		Optional<Integer> position = position(cs[0]);

		System.out.println(position);
	}

}
