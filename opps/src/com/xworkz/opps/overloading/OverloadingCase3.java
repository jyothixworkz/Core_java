package com.xworkz.opps.overloading;

public class OverloadingCase3 {
	public void m1(String s) {
		System.out.println("string version ");
		
		
	}
	public void m1(StringBuffer s) {
		System.out.println("stringbuffer version ");
		
		
	}
	public static void main(String[] args) {
		OverloadingCase3 case3 = new OverloadingCase3();
		case3.m1("manoj");
		case3.m1(new StringBuffer("manoj"));
		//case3.m1(null);
		// there is no relation ship compile error 
	}


}
