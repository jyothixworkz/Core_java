package com.xworkz.aptitude.charposition;

public class LowerCase {
	public static void main(String[] args) {

		String value = "S";
		upperCase(value);
		int s='s';
		char c=145;
		System.out.println(c);
		//System.out.println(s);
	}

	private static void upperCase(String value) {
		//System.out.println(value.length());
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			c = (char) ((c +32));
			System.out.print(c);

			
		}

	}

}
