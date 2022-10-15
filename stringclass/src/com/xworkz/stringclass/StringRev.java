package com.xworkz.stringclass;

public class StringRev {
	
	public static void main(String[] args) {
		String name=args[0];
		
		for(int i=name.length();i>0;i--) {
			System.out.print(name.charAt(i-1));
		}
		System.out.println(" ");
		int i =name.length();
		while( i !=0) {
			
			System.out.print(name.charAt(i-1));
			i--;
		}
		
		
		
		
	}

}
