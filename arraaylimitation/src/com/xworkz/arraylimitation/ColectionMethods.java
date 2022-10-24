package com.xworkz.arraylimitation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColectionMethods {
	public static void main(String[] args) {
	Collection list = new ArrayList();
	 ColectionMethods colectionMethods = new ColectionMethods();
	 ColectionMethods colectionMethods2 = new ColectionMethods();
	boolean add = list.add(1);
	
	boolean add2 = list.add(colectionMethods);
	boolean add3 = list.add(colectionMethods2);
	System.out.println(add + " "+add2+add3);
	
	ArrayList arrayList = new ArrayList();
	arrayList.add(1);
	arrayList.add(colectionMethods2);
	boolean retainAll = list.retainAll(arrayList);
	System.out.println(retainAll);
	System.out.println(list);
	
	
	//boolean remove = list.removeAll(list);
	//System.out.println(remove);
	//list.clear();
	boolean contains = list.contains(colectionMethods);
	System.out.println(contains);
	boolean empty = list.isEmpty();
	System.out.println(empty);
	int size = list.size();
	System.out.println(size);
	Object[] array = list.toArray();
	System.out.println(array[1]+" "+array[0]);
	//Iterator iterator = list.iterator();
	
	}


}
