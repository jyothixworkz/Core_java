package com.xworkz.aptitude.fibbonacci;

public class F {
	
	
	
	public static void main(String[] args) {
	 int num=0;
	 int num1=1;
	 int num2;
	 System.out.print(num+" "+num1+" ");
	 
	 for(int i=0; i<20;i++) {
		 
		 num2=num+num1;
		 System.out.print(num2+" ");
		 num=num1;
		 num1=num2;
		 
	 }
	 
		
		
		
		
		
		
	}

}
