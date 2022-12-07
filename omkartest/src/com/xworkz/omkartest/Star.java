package com.xworkz.omkartest;

public class Star {
	public static void main(String[] args) {

		for (int i = 0; i < 7; i++) {

			for (int j = (i + 1); j < 7; j++) {

				System.out.print(" ");
			}

			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
