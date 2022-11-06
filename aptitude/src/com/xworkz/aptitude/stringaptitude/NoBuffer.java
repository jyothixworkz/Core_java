package com.xworkz.aptitude.stringaptitude;

import java.util.Scanner;

public class NoBuffer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter the string value");
		String next = scanner.next();
		

	//	String value = "manoj";

		for (int i = next.length(); i > 0; i--) {

			System.out.print(next.charAt(i - 1));
		}

	}
}
