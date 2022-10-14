package com.xworkz.collectionmethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethods {
	public static void main(String[] args) {
		
	ArrayList<Object> list = new 	ArrayList<Object>();// it
	//will create abj with default capacity is 10
	// once it reach its capacity a new obj is created with the formula
	//new cap= (current cap*3/2)+1
	list.add("manoj");
	list.add("r");
	String m="r";
	for(int i=0 ; i<list.size();i++) {
		
		System.out.println(list.get(i));
	}
	for (Object object : list) {
		System.out.println(object);
	}
	Iterator<Object> iterator = list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	ListIterator<Object> listIterator = list.listIterator();
	System.out.println(listIterator.hasNext());
	System.out.println(listIterator.next());
	
		ArrayList<Object> list2 = new ArrayList<>(20);// it will create obj with customezed  initial capacity
		  Collection<Object> synchronizedCollection = Collections.synchronizedCollection(list);
	//	System.out.println(synchronizedCollection);
		
	}

}
