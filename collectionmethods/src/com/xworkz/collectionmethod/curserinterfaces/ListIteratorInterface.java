package com.xworkz.collectionmethod.curserinterfaces;

import java.util.ArrayList;
import java.util.ListIterator;

import com.xworkz.collectionmethods.LinkedArrayMethod;

public class ListIteratorInterface {
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
 arrayList.add("MANOJ");
 		arrayList.add("nandan");
 		arrayList.add("darshan");
 		arrayList.add("man");
 		arrayList.add("kalyan");
 		arrayList.add("nagaraju");
 		arrayList.add("vijay");
 		arrayList.add("lakshimi");
 		//System.out.println(arrayList);
 		ListIterator<Object> listIterator = arrayList.listIterator();
 		while(listIterator.hasNext()) {
 			
 			Object next = listIterator.next();
 			if(next.equals("darshan")) {
 				listIterator.remove();
 				//System.out.println(arrayList);
 			}
 			else if(next.equals("MANOJ")){
 				listIterator.add("kuhdfskjgf");
 			//System.out.println(arrayList);
 			}
 			else if (next.equals("nagaraju")) {
 				
 				listIterator.set("dlffef");
 				System.out.println(arrayList);
 			}
 		}
	
	
	
	}

}
