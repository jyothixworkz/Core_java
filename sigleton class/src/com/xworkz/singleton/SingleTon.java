package com.xworkz.singleton;

public class SingleTon {
	private static SingleTon sinlgleTon;
	private SingleTon() {
		
	}
	public static  SingleTon getSingleTon() {
		
		return sinlgleTon;
		
	}
	static {
		sinlgleTon=new SingleTon();
	}

}
