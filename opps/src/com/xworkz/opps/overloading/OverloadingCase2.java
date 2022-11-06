package com.xworkz.opps.overloading;

public class OverloadingCase2 {
	
	private void m1(Object o) {
		System.out.println("object version");
		// TODO Auto-generated method stub

	}
	private void m1(String s) {
		// TODO Auto-generated method stub
System.out.println("string vertion");
	}
	
	public static void main(String[] args) {
		OverloadingCase2 overloadingCase2 = new OverloadingCase2();
		overloadingCase2.m1(new Object());
		overloadingCase2.m1("manoj");
		overloadingCase2.m1(null);
	}

}
