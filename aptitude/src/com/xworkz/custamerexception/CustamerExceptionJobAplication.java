package com.xworkz.custamerexception;

public class CustamerExceptionJobAplication {
	public static void main(String[] args) {

		int parseInt = Integer.parseInt(args[0]);

		if (parseInt > 60) {
			throw new GreaterAge("\"u r age is tooo greater then my requirement \"");
		} else if (parseInt < 18) {
			throw new ToLowAge("u r age is too low then my requirement please try after get old of 18");
		} else {
			System.out.println(" u r eligible to work with us");
		}

	}

}
