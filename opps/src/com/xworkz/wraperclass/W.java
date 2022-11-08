package com.xworkz.wraperclass;

public class W {

	public static void main(String[] args) {
		int m = 10;
		String s = "127";
		Byte valueOf3 = Byte.valueOf(s);
		System.out.println(valueOf3);

		Integer valueOf = Integer.valueOf(m);
		Integer valueOf2 = Integer.valueOf(s);
		System.out.println(valueOf);
		System.out.println(valueOf2);
		Integer valueOf4 = Integer.valueOf("1111", 2);
		System.out.println(valueOf4);
		// xxxvalue
		Integer integer = new Integer(10);
		int intValue = integer.intValue();
		byte byteValue = integer.byteValue();
		float floatValue = integer.floatValue();
		System.out.println(floatValue);
		Character character = new Character('a');
		char charValue = character.charValue();
		System.out.println(charValue);
		// parsexxx()
		
		String m1 = "100";
		byte parseByte = Byte.parseByte(m1);

		System.out.println(parseByte);

		// tostring

		// int b=10;

		Integer integer2 = new Integer(10);
		String string = integer2.toString();
		System.out.println(string);//mass

	}

}
