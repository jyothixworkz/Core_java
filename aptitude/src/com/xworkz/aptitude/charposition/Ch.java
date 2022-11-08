package com.xworkz.aptitude.charposition;

public class Ch {

	static int pos(char value) {
		char upperCase = Character.toUpperCase(value);
		int asci = (int) upperCase;

		int position = asci - 64;
		return position;

	}
	public static void main(String[] args) {
		char c='d';
		int pos = pos(c);
		System.out.println(pos);
	}

}
