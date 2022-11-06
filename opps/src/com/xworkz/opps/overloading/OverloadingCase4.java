package com.xworkz.opps.overloading;

public class OverloadingCase4 {
	public void m1(int i) {
		
		System.out.println(" int  version");
		
	}
	public void m1(int... i) {//1.5 version var args method
		
		System.out.println("var args version");
		
	}
	public static void main(String[] args) {
		OverloadingCase4 overloadingCase4 = new OverloadingCase4();
		overloadingCase4.m1();
		overloadingCase4.m1(10,20);
		overloadingCase4.m1(10);
	}

}
