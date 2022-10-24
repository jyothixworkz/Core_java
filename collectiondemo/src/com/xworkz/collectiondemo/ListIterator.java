package com.xworkz.collectiondemo;

import java.util.ArrayList;


public class ListIterator {

	public static void main(String[] args) {

		ArrayList<Object> arrayList = new ArrayList<>();

		arrayList.add(" manaoj".trim());
		arrayList.add("jayanth".trim());
		arrayList.add("man");
		arrayList.add("mango");
		arrayList.add("manja");
		System.out.println(arrayList);

		java.util.ListIterator<Object> m = arrayList.listIterator();

		while (m.hasNext()) {
String next = (String)m.next();
System.out.println(next);
if(next.equals("manoj")) {
	m.remove();
	System.out.println(arrayList);
}
if(m.next().equals("man")) {
	
	
	m.add("m");
	System.out.println(arrayList);
}
if(m.next().equals("jayanth")) {
	m.set("ssssssssssss");
}
			

		}

	}

}
