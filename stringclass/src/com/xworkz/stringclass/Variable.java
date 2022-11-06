package com.xworkz.stringclass;

public class Variable {
	String obj;
	static String obj2;

	public static void main(String[] args) {

		Variable variable = new Variable();
		Variable variable2 = new Variable();
		Variable variable3 = new Variable();

		variable.obj = "embede";
		System.out.println(variable.obj);
		System.out.println(variable2.obj);
		System.out.println(variable3.obj);

		variable.v();

	}

	public void v() {

		Variable variable4 = new Variable();
		Variable variable5 = new Variable();
		Variable variable6 = new Variable();
		variable4.obj2 = "technology";
		System.out.println(variable4.obj2);
		System.out.println(variable5.obj2);
		System.out.println(variable6.obj2);

		// TODO Auto-generated method stub

	}

}
