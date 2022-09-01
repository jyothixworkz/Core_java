package com.xworkz.final1;

public class Final {
	// final is the keyword used to declare the class as final and stop to inheritance 
	// when we are declare this class as a final then the child class is not possible
	private final  int age;// we can declare the variable as final if we are declare  variable as final then
	// we cannot change the value once we initialize it 
	// from 1.5 v it is manditary to inisialization only once 
	 String name;
	 private String location;
	public Final(int age) {
		
		this.age=age;// declaraton of final variable is do
		
		
	}
	@Override
	public String toString() {
		return "Final [age=" + age + "]";
	}
     public void setLocation(String location) {
		this.location = location;
	}
}
