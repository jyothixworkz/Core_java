package com.xworkz.aptitude.number;

import java.util.Scanner;

public class P {

	public static boolean pol(int value) {

		int num = value;
		int temp = num;
		int rem;
		int rev = 0;
		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (rev == num) {

			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the num");
		int nextInt = scanner.nextInt();

		boolean pol = pol(nextInt);
		System.out.println(pol);

	}

}
