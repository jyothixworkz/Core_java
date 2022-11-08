package com.xworkz.wraperclass;

public class MethodsWrapper {
	public static void main(String[] args) {

		// given primitive or strig

		Integer valueOf = Integer.valueOf("10");
		System.out.println(valueOf);
		Integer valueOf2 = Integer.valueOf(10);
		System.out.println(valueOf2);
		Integer integer = new Integer(10);
		int intValue = integer.intValue();
		System.out.println(intValue);

		String s = "10";
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		int s1 = 10;
		String string2 = Integer.toString(15, 2);
		System.out.println(string2);

		// s1.toString();
		Integer integer2 = new Integer(20);

		String string = integer2.toString();
		System.out.println(string);
		String string3 = Integer.toString(10);
	}

}
