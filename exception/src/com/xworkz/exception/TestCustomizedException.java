package com.xworkz.exception;

public class TestCustomizedException {
	public static void age(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("u r too young come after compliting the age 18 years");
		}
		else {
			System.out.println("u can vote");
		}
		
	}

	public static void main(String[] args) throws InvalidAgeException {
		try {
			age(199);
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			
		}
		
  age(18);
  
	}


}
