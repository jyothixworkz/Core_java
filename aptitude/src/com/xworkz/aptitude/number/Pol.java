package com.xworkz.aptitude.number;

import java.util.Scanner;

public class Pol {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" enter the num");
		int nextInt = scanner.nextInt();

		int tump = nextInt;

		int rev = 0;
		int rem;
		while (tump != 0) {
			rem = tump % 10;
			rev = rev * 10 + rem;
			tump = tump / 10;

		}

		if (nextInt == rev) {
			System.out.println("pollindrom");
		} else {
			System.out.println("not");
		}
	}

}
