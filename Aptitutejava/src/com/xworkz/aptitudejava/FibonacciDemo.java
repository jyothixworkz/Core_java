package com.xworkz.aptitudejava;

public class FibonacciDemo {
	
	
static 	char v;
static boolean m;
	public static void main(String[] args) {
		System.out.println(m);
		System.out.println(v);
		int n1=0;
		int n2=1;
		int i, n3;
		int count=10;
		for(i=-1;i<count;i++) {
			n3=n1+n2;
		//	System.out.println(i);
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
