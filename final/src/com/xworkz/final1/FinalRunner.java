package com.xworkz.final1;

public class FinalRunner {
	public static void main(String[] args) {
		FinalChild finalChild= new FinalChild(25);//we canot change after initialization 
	System.out.println(finalChild);
	finalChild.name="manoj";
	System.out.println(finalChild.name);
	finalChild.setLocation("huligerepura");
	
	}
	

}
