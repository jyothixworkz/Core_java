package com.xworkz.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {

			list.add(i);

		}
		System.out.println(list);
		Iterator<Object> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer next = (Integer)iterator.next();
  if(next %2==0) {
	  System.out.println(next);
	  
  }
  else {
	  
	iterator.remove();
  }
  System.out.println(list);

		}
	}

}
