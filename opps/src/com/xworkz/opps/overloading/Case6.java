package com.xworkz.opps.overloading;

public class Case6 {
	public void m1(OverloadingCase6 case6) {
		
		System.out.println("Parent version ");
	}
	public void m1(OverloadingCase6Child case6) {
		
		System.out.println("child version ");
	}
	public static void main(String[] args) {
		Case6 case6 = new Case6();
		OverloadingCase6 overloadingCase6 = new OverloadingCase6();
		case6.m1(overloadingCase6);
		OverloadingCase6Child overloadingCase6Child = new OverloadingCase6Child();
		case6.m1(overloadingCase6Child);
		OverloadingCase6 child = new OverloadingCase6Child();
		case6.m1(child);
	}

}
