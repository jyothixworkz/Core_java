package com.xworkz.stringclass;

public class Polli {
	public static void main(String[] args) {
		
		boolean check = check("mam");
		System.out.println(check);
		
		   
		
		
		
	}
	public static boolean check(String string) {
		
		StringBuffer buffer = new StringBuffer(string);
		StringBuffer reverse = buffer.reverse();
		String string2 = buffer.toString();
		
		System.out.println(string2);
		if(string2.equals(string2))
			return true;
		else
			return false;
		
		
		
	}

}
