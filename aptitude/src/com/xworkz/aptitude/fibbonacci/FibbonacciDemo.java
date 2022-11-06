package com.xworkz.aptitude.fibbonacci;

public class FibbonacciDemo {

	public static void main(String[] args) {
		int n = 0;
		int n1 = 1;
		int n2;
		int count = 10;
		System.out.print(n + " " + n1 + " ");
		for (int i = 0; i < count; i++) {
			n2 = n + n1;
			System.out.print(n2 + " ");
			n = n1;
			n1 = n2;

		}

	}

}
