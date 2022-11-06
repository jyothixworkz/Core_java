package com.xworkz.aptitude.singleton;

public class Single {
	private static Single single;

	public static Single getSingle() {
		return single;
	}

	static {

		single = new Single();
	}

	public static void main(String[] args) {

		Single single2 = single.getSingle();
		Single single3 = single.getSingle();
		System.out.println(single2 == single3);//true
		System.out.println(single2.equals(single3));//treu
	}

}
