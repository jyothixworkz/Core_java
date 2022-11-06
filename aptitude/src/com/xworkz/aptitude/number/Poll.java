package com.xworkz.aptitude.number;

import java.util.Scanner;

public class Poll {
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter the num ");
		int nextInt = scanner.nextInt();
		 int temp=nextInt;
		int rem;
		int rev=0;
		while(temp !=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			
			
		}
		if(nextInt==rev) {
			System.out.println("polli"+" "+rev);
		}
		else {
		System.out.println(" not polli"+ " "+rev);
		}
				
				
	}

}
