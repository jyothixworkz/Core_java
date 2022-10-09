package com.xworkz.stringclass;

import java.util.Scanner;

public class StringClassDemo {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("enter city name in next line:");
		 String next = scanner.next().toLowerCase().trim();
		 if(next.equals("hydrabad")) {
			 System.out.println("welcome to hydrabad");
			 
		 }
		 else if(next.equals("banglore")) {
			 System.out.println("welcome to banglore");
		 }
			 else if(next.equals("chanai")) {
				 System.out.println("welcome to chanai");
				 
			 }
			 else {
				 System.out.println("enter currect city name");
			 }
		 
	}

}
