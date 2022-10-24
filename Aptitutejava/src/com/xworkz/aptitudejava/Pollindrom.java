package com.xworkz.aptitudejava;

public class Pollindrom {

	public static void main(String[] args) {
		int num = 283;
		int temp = num;
		int rev = 0;
		int rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if(num==rev) {
			System.out.println("poli");
		}

	}
}
