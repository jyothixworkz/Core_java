package com.xworkz.aptitude.singleton;

public class Singleton1 {
	private static Singleton1 singleton1;
	public static Singleton1 getSingleton1() {
		return singleton1;
		
	}
	static {
		
		
		singleton1=new Singleton1();//singleton 
	}

}
