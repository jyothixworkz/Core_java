package com.xworkz.aptitudejava;

import java.text.DateFormatSymbols;

public class Fibbo {

	public static void main(String[] args) {
		DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
		String[] months = dateFormatSymbols.getMonths();
		String[] weekdays = dateFormatSymbols.getWeekdays();
		String[][] zoneStrings = dateFormatSymbols.getZoneStrings();
		for (String string : months) {
			// System.out.println(string);

		}
		for (String string : weekdays) {
			// System.out.println(string);
		}
		for (String[] strings : zoneStrings) {
			for (String strings2 : strings) {
				System.out.println(strings2);

			}
			// System.out.println(strings);

		}

		int n = 0, n1 = 1;
		int n2;
//int n3;
		int count = 20;
		System.out.print(n + " " + n1+" ");
		for (int i = 0; i < count; i++) {
			n2 = n + n1;
			System.out.print(n2 + " ");
			n = n1;
			n1 = n2;
		}
	}

}
