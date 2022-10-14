package com.xworkz.collectionmethod.curserinterfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorICurserInterface {
	
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		for(int i=0; i<20;i++) {
			
			arrayList.add(i);
		}
		System.out.println(arrayList);
		Iterator<Object> iterator = arrayList.iterator();
		
while(iterator.hasNext()) {
	Integer next =(Integer) iterator.next();
	
	if(next%2==0) {
		System.out.println(next);
	}
	else {
		{
	//	System.out.println(iterator.remove());//
			iterator.remove();
		}
	}
}
		System.out.println(arrayList);
	}
	

}
