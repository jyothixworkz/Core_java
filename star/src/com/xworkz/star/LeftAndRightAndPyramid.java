package com.xworkz.star;

import java.util.HashMap;
import java.util.Objects;

public class LeftAndRightAndPyramid {
	private int i;

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============================================");

		for (int i = 0; i < 4; i++) {
			for (int j = 2 * (4 - i); j >= 0; j--) {
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println("=====================================================");

		for (int i = 0; i < 4; i++) {

			for (int j = 4 - i; j >= 0; j--) {
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
