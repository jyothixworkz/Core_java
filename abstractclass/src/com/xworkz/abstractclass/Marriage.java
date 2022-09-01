package com.xworkz.abstractclass;
// the possible things that contain abstract class is
//*it contains nothing
//* it contains all concrete method
//* it contains both concrete and abstract method
//* if the class contain one obstract class then it should be declare as abstract class
// most importently it also contain constarctor for chaining purpose
public abstract class Marriage {
	
	public Marriage() {
		
	}

	
	public  abstract  void manojMarriage();// it is the abstract method 
	// obstract methods is not have a body its end with semicolon not curlybraces 
	public void jayanthMarriage(){
		System.out.println(" jayanth get marriage");//abstract class also contain concrete class
		
	}
		
	
	
	
	
	
	
	
}
