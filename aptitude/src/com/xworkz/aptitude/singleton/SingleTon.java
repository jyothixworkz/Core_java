package com.xworkz.aptitude.singleton;

public class SingleTon {

	private static SingleTon singleTon;

	public SingleTon() {
		super();
		// TODO Auto-generated constructor stub
	}

	static {

		singleTon = new SingleTon();
	}

	public static SingleTon getSingleTon() {
		return singleTon;
	}

}
