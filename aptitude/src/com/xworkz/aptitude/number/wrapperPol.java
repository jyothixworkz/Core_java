package com.xworkz.aptitude.number;

public class wrapperPol {
	public static void main(String[] args) {

		int i = 202;

		String integer = new Integer(i).toString();
		// String string = integer.toString();
		StringBuffer buffer = new StringBuffer(integer).reverse();
		// StringBuffer reverse = buffer.reverse();
		String string2 = buffer.toString();
		int parseInt = Integer.parseInt(string2);
		System.out.println(parseInt);
		System.out.println(i);
		if (parseInt == i) {
			System.out.println("yes ");
		} else {

			System.out.println("no");
		}
	}

}
