package com.xworkz.aptitude.charposition;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class StringDup {
	static char c;

	public static void dup(String s) {
		char[] charArray = s.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {

			if (!set.contains(charArray[i])) {

				set.add(charArray[i]);
			} else {
				System.out.print(charArray[i]);
			}

		}
		System.out.println();
		System.out.println(set);
		for (int i = 0; i < set.size(); i++) {
			Object[] array = set.toArray();

			String[] string = (String[]) array;
			System.out.println(string);

		}

	}

	@Override
	public String toString() {
		return "StringDup []";
	}

	public static void main(String[] args) {
		String value = "manojmanoj";

		char[] chars = value.toCharArray();
		Set<Character> set = new LinkedHashSet();
		for (char ch : chars) {
			if (!set.contains(ch)) {
				set.add(ch);
			} else {
				System.out.print(ch);
			}
		}
		System.out.println(set);
		String string = set.toString();
		System.out.println(string);
		char[] charArray = string.toCharArray();

		for (char c : charArray) {
			System.out.println(c);
		}
	}

}
