package com.xworkz.aptitudejava;

public class StringReverse {
public static void main(String[] args) {
	
	String s="manoj";
	for(int i=s.length();i>0;i--) {
		
		System.out.print(s.charAt(i-1));
				
	}
	System.out.println();
	int i=s.length();
	while(i>0) {
		System.out.print(s.charAt(i-1));
		i--;
	}
	System.out.println();
	String string= "malathesh";
	for(int i1=string.length();i1>0;i1--) {
		System.out.print(string.charAt(i1-1));
		
	}
}
}
