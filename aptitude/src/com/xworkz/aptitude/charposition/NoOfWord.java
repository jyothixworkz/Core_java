package com.xworkz.aptitude.charposition;

import java.util.Scanner;

public class NoOfWord {
	static int count;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int nextInt = scanner.nextInt();

		while (nextInt > 0) {

			count++;
			 nextInt = nextInt / 10;
		}
		System.out.println(count);
	}

}
