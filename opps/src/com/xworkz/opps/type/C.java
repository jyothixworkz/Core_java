package com.xworkz.opps.type;

public class C extends P {

	void m2() {

		System.out.println("child");
	}

	public static void main(String[] args) {
		C c = new C();

		c.m1();
		c.m2();
		P p = (P) c;
		p.m1();

	}
}
