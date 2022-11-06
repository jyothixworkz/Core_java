package com.xworkz.aptitude.stringaptitude;

public class StringDemo1 {
	
	static boolean reverse( String str) {
		
		StringBuffer buffer = new StringBuffer(str);
		StringBuffer reverse = buffer.reverse();
		String string = reverse.toString();
		System.out.println(string);
		if(str.equals(string)) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		boolean reverse = reverse("manoj");
		System.out.println(reverse);
		
	}

}
