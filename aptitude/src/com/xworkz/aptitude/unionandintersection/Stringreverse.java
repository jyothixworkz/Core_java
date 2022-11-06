package com.xworkz.aptitude.unionandintersection;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" enter the string");

		String next = scanner.next();
		for (int i = next.length(); i > 0; i--) {

			System.out.print(next.charAt(i - 1));
		}

	}

}
