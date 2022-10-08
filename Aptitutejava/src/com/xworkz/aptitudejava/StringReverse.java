package com.xworkz.aptitudejava;

import java.util.Iterator;

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
	
}
}
