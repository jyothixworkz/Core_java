package com.xworkz.aptitude.stringaptitude;

public class S {
	
	 static boolean pol(String value) {
		
		
		StringBuffer stringBuffer = new StringBuffer(value);
		StringBuffer reverse = stringBuffer.reverse();
		String string = reverse.toString();
		System.out.println(string);
		if(value.equals(string)) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		String s="manoj";
		
		for(int i=s.length();i>0;i--) {
			
			
			System.out.print(s.charAt(i-1));
		}
		System.out.println();
		boolean pol = pol("mam");
		System.out.println(pol);
		
	}

}
