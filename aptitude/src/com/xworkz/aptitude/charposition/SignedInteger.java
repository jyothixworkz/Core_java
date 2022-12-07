package com.xworkz.aptitude.charposition;

public class SignedInteger {
	static int count;

	public static void main(String[] args) {
		int m = 120000;

		Integer valueOf = Integer.valueOf(m);
		String string = valueOf.toString();
		System.out.println(string);
		while (m > 0) {
			count++;
			m = m / 10;

		}
		System.out.println(count);
	}

}
