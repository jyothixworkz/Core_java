package com.xworkz.collectionmethod.curserinterfaces;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CurserClass {
	
	
	public static void main(String[] args) {
		  Vector<Object> vector = new Vector<>();
		  Enumeration<Object> elements = vector.elements();
		  Iterator<Object> iterator = vector.iterator();
		ListIterator<Object> listIterator = vector.listIterator();

		System.out.println(elements.getClass().getName());
		System.out.println(iterator.getClass().getName());
		System.out.println(listIterator.getClass().getName());
		
		
		System.out.println(elements.getClass().getSimpleName());
		System.out.println(iterator.getClass().getSimpleName());
		System.out.println(listIterator.getClass().getSimpleName());
	}

}
