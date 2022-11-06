package com.xworkz.opps.overloading;

public class Overloading {
	//case1
	
	public void m1(int i) {
		System.out.println("int args method");
	}
	public void m1(float f) {
		System.out.println("float args method");
	}
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.m1(10);
		overloading.m1(10.5f);
		overloading.m1('a');
		overloading.m1(10l);
		
	}
	

}
