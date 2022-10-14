package com.xworkz.aptitudejava;

public class PolyndromeCheck {
	int r ,m=0,temp;
	
	public static void main(String[] args) {
		System.out.println(PolyndromeCheck.checkPolyndrome("mam"));
		System.out.println(checkPolyndrome("manoj"));
		int r = 0,m=0,temp = 0;
		System.out.println(m);
		System.out.println(r);
		System.out.println(temp);
	}
	public static boolean checkPolyndrome( String str) {
		StringBuffer buffer = new StringBuffer(str);
		StringBuffer reverse = buffer.reverse();
		//System.out.println(reverse);
		String string = buffer.toString();
		if(str.equals(string)) {
			return true;
			
		}
		return false ;
		
		
	}

}
