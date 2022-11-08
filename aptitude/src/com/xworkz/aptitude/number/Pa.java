package com.xworkz.aptitude.number;

public class Pa {
	public static void main(String[] args) {
		int num=101;
		int temp=num;
		int rem;
		int rev=0;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==num) {
			
			
			System.out.println("pol");
		}
		else {
			System.out.println("not pol");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
