package com.xworkz.aptitude.fibbonacci;

public class Fi {

	public static void main(String[] args) {

		int num = 0, num1 = 1, num2, count = 10;
		System.out.print(num + " " + num1 + " ");
		for (int i = 0; i < count; i++) {
			num2 = num + num1;
			System.out.print(num2 + " ");
			num = num1;
			num1 = num2;

		}

	}

}
