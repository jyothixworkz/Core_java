package com.xworkz.stringclass;

public class StringReverse {
	public static void main(String[] args) {
		 String name="manoj";
		 
		 for(int i=name.length();i>0;i--) {
			 
			System.out.print(name.charAt(i-1)); 
			 
		 }
		 System.out.println();
		 int i=name.length();
		 while(i!=0) {
			 
			// System.out.print(" ");
			 System.out.print(name.charAt(i-1));
			 
			 i--;
		 }
		 
		 
		 
	}

}
