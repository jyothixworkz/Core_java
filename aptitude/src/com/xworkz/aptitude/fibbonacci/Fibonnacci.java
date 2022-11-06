package com.xworkz.aptitude.fibbonacci;

public class Fibonnacci {

	public static void main(String[] args) {
		int n = 0, n1 = 1;
		int n2;
		System.out.print(n + " " + n1+" ");
		int count = 10;

		for (int i = 0; i < count; i++) {

			n2 = n + n1;
			System.out.print(n2+" ");
			n = n1;
			n1 = n2;

		}
	}

}
