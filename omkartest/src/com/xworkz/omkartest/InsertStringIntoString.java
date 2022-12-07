package com.xworkz.omkartest;

import java.util.Arrays;

public class InsertStringIntoString {
//	7 . Insert a String into another String in Java
//	 Input: originalString = "Computer Portal",
//	 stringToBeInserted = "Science ",
//	 index = 8
//	 Output: "Computer Science Portal"

	public static void main(String[] args) {

		String originalString = "Computer Portal";
		String stringToBeInserted = "Science";
		// there are so many ways to do this
		// we can do like this also using StringBuffer class method
		// it is mutable which allows us to insert and append
		StringBuffer stringBuffer = new StringBuffer(originalString);
		StringBuffer insert = stringBuffer.insert(8, " " + stringToBeInserted);
		String string = insert.toString();
		System.out.println(string);

	}

}
