package com.xworkz.aptitude.charposition;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StringJoiner {
	public static void main(String[] args) {
		String s = "manoj";
		java.util.StringJoiner joiner = new java.util.StringJoiner(",");
		joiner.add("a");
		joiner.add("2");
		String string = joiner.toString();
		// System.out.println(string);
		joiner.setEmptyValue(string);
		// System.out.println(joiner);

		java.util.StringJoiner joiner2 = new java.util.StringJoiner(":");

		joiner2.add("a");
		joiner2.add("b");
		// System.out.println(joiner2);

		joiner.merge(joiner2);
		// System.out.println(joiner);

		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.stream().filter((m) -> m.getClass() != null).toString();
		Integer i = new Integer(49);
		double sqrt = Math.sqrt(i);
		double floor = Math.floor(sqrt);
		if(floor==sqrt) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		

	}

}
