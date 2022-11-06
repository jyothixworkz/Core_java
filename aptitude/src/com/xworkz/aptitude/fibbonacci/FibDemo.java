package com.xworkz.aptitude.fibbonacci;

public class FibDemo {
	
	
	public static void main(String[] args) {
		int n=0,n1=1,n2,count=20;
		System.out.print(n+n1+" ");
		for(int i= 0; i<count;i++) {
			n2=n+n1;
			System.out.print(n2+" ");
			n=n1;
			n1=n2;
		}
		
	}

}
