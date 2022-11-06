package com.xworkz.star;

public class LeftStar {
	public static void main(String[] args) {
		
		System.out.println("manoj");
		
		for(int i=0;i<6;i++) {
			
			for(int j=2*(6-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
