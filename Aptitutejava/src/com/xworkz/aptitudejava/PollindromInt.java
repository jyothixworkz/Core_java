package com.xworkz.aptitudejava;

public class PollindromInt {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp = num;
		int rev = 0;
		int rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (num == rev) {
			System.out.println(" it is polindrome");
		} else {
			System.out.println(" its not");
		}
	}

}
