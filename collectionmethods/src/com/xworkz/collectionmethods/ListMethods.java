package com.xworkz.collectionmethods;

import java.util.ArrayList;

public class ListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(0, "m");
		arrayList.add(1, "b");
		arrayList.add(2, "manoj");
		System.out.println(arrayList.get(2));
	//	arrayList.addAll(3,collection obj );
	       System.out.println(arrayList.remove(2));
	       System.out.println(arrayList.get(1));
	       System.out.println(arrayList.set(1, "jayaram"));
	       System.out.println(arrayList.get(1));
	       
		
		
		
		
	}
	
	
	
	
	
	
	

}
