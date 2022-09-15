package com.xworkz.exception;

public class Runner {
	public static void main(String[] args) {
		// int i = Integer.parseInt(args[0]);
		int i = 1235;
		if (i == 1234) {

			System.out.println("collect the money");

		} else {
			throw new ATMPinException(
					"ATM pin is wrong thats  why we connt give money to u please enter the valid pin or get out from here ");
		}
	}

}
