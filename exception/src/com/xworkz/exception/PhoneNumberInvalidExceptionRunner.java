package com.xworkz.exception;

public class PhoneNumberInvalidExceptionRunner {

	public static void main(String[] args) {

		 Long number = Long.parseLong(args[0]);
		//long number = 7204250720l;
		if (number == 7204250720l)
			System.out.println(" it is manoj phone number");
		else {

			throw new PhoneNumberInvalidException(
					" it is not a manoj number please enter manoj number ather wise" + " get out from here ");
		}

	}
}
