package com.xworkz.aptitudejava;

public class FibonacciDemo {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int i, n3;
		int count=1;
		for(i=-1;i<count;i++) {
			n3=n1+n2;
			System.out.println(i);
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
