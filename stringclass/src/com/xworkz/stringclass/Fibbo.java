package com.xworkz.stringclass;

public class Fibbo {

	public static void main(String[] args) {

		int n = 0, n1 = 1, n2, count = 10;
		System.out.print(n + " ");
		for (int i = 0; i < count; i++) {
			n2 = n + n1;
			System.out.print(n2 + " ");
			n = n1;
			n1 = n2;

		}

	}

}
