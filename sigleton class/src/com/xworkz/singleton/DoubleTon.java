package com.xworkz.singleton;

public class DoubleTon {
	private  static DoubleTon  doubleTon;
	private static DoubleTon doubleTon2;
	  private DoubleTon() {
		// TODO Auto-generated constructor stub
	}
	 public static  DoubleTon getDoubleTon() {
		  
		  
		  return doubleTon;
	  } 
	 public static  DoubleTon getDoubleTon2() {
		return doubleTon2;
	}
	 static {
		 doubleTon=new DoubleTon();
		 doubleTon2=new DoubleTon();
	 }

}
