package com.xworkz.opps.type2;

public class C extends B {
	void m() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		 C c = new C();
		 
		 c.m();
		B b= (B)c;
		b.m();
	A a=(A)((A)b);
	a.m();
		
	}

}
