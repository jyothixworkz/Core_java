package com.xworkz.aptitude.charposition;

public class Uppercase {
	//private static char[] v;

	//static char  v;

	// static char c;


	public static  void upperCase(String value) {
		
	//	System.out.println(" i am converting");
		//System.out.println(v);
		
		for(int i=0;i<value.length();i++) {
			
			char c=value.charAt(i);
			//System.out.println("manoj is converting");
			if(65<=c&&c<=c) {
			//System.out.println(((char)(c+32)));
			 c= (char)((c+32));
			}
			 System.out.print(c);
		}
	//	System.out.print(v);
	//	System.out.println("manoj is converting");
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		int a='a';
		System.out.println(a);
		String value = args[0];
		
		upperCase(value);
		
	}

}
