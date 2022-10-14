package com.xworkz.collectionmethods;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedArrayMethod {

	
	
	public static void main(String[] args) {
		  LinkedList<Object> linkedList = new LinkedList<>();// it will create obj with initial capaoty 10
		  // there is no custamized capacity con for this 
		  
		  
		  linkedList.add("manoj");
		  linkedList.add("hhjsgcjas");
		  List<Object> synchronizedList = Collections.synchronizedList(linkedList);
		  
		 // System.out.println(synchronizedList);
		  
		  for(int i=0;i<linkedList.size();i++) {
			  System.out.println(linkedList.get(i));
		  }
		  for (Object object : synchronizedList) {
			  System.out.println(object);
			
		}
		  Iterator<Object> iterator = linkedList.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
		  ListIterator<Object> listIterator = linkedList.listIterator();
		  while(listIterator.hasNext()) {
			  
			  System.out.println(listIterator.next());
			  
			  
		  }
		  linkedList.addFirst("man");
		  System.out.println(linkedList);
		  linkedList.addLast("g");
		  
		  
	}
}
