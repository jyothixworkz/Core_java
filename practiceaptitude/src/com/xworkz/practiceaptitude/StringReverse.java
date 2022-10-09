package com.xworkz.practiceaptitude;

import java.util.Iterator;

public class StringReverse {
	public static void main(String[] args) {
		String manoj="sallumarada thimmaka";
		for(int i=manoj.length();i>0;i--) {
			System.out.print(manoj.charAt(i-1));
		}
		int i= manoj.length();
		System.out.println(" ");
		while(i>0) {
			
			System.out.print(manoj.charAt(i-1));
			i--;
			
			
		}
	}

}
