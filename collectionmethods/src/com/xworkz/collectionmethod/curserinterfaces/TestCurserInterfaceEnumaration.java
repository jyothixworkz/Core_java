package com.xworkz.collectionmethod.curserinterfaces;

import java.util.Enumeration;
import java.util.Vector;

public class TestCurserInterfaceEnumaration {
	public static void main(String[] args) {
		Vector<Object> vector = new Vector<>();
		
		for (int i=0; i<10;i++) {
			vector.addElement(i);
			//System.out.println(vector);
		}
		System.out.println(vector);
		Enumeration<Object> elements = vector.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		
		
		
	}

}
