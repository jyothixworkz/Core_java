package com.xworkz.aptitude.stringaptitude;

public class StringPollindrom {

	public static  boolean stringPolindrom(String values) {

		StringBuffer stringBuffer = new StringBuffer(values);
		StringBuffer reverse = stringBuffer.reverse();
		String string = stringBuffer.toString();
		System.out.println(string);

		if (string.equals(values)) {
			return true;
		} else {
			return false;
		}

	}
	public static void main(String[] args) {
		
		String value = args[0];
		boolean stringPolindrom = stringPolindrom(value);
		System.out.println(stringPolindrom);
		
	}

}
