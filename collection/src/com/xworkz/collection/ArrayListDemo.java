package com.xworkz.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("manoj");
		l.add("jayanth");
		l.add("nandan");
		l.add("10");
		l.add(null);
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.add(0, "jayaram");
		l.add("omkar");
		System.out.println(l);
		String string = l.get(0);
		System.out.println(string);
		String remove = l.remove(2);
		System.out.println(remove);
		String set = l.set(3, "man");
		System.out.println(set);
		int indexOf = l.indexOf("jayaram");
		System.out.println(indexOf);
		int lastIndexOf = l.lastIndexOf("manoj");
		System.out.println(lastIndexOf);

	}

}
