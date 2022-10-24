package com.xworkz.collectiondemo;

import java.util.Enumeration;
import java.util.Vector;

public class CurserDemo {
	
	
	
	public static void main(String[] args) {
		
		    Vector<Object> vector = new Vector<>();
		    
		    
		    for(int i =0; i<10;i++) {
		    	
		    	
		    	vector.add(i);
		    	
		    	
		    }
		    System.out.println(vector);
		
		       Enumeration<Object> elements = vector.elements();
		       if(elements.hasMoreElements()) {
		    	   Integer integer=(Integer)elements.nextElement();
		    	   
		    	   System.out.println(integer);
		    	   System.out.println(integer);
		       }
		
		
		
		
	}

}
