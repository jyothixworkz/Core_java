package com.xworkz.aptitude.charposition;
public class C8 {
	public static void main(String[] args) {
		CharP charP = value -> {
			char upperCase = Character.toUpperCase(value);
			int intValue = (int) upperCase;
			int want = intValue - 64;
			return want;
		};
		int charP2 = charP.charP('m');
		System.out.println(charP2);
	}
}
