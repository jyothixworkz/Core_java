package com.xworkz.changepositionofarray;

import java.util.ArrayList;

public class ArrayPosImpl  implements ArrayPos{
	static int p=0;
	
	@Override
	public void pos(int[] array) {
		ArrayList<Object> arrayList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {

			arrayList.add(array[i]);
		}
		// System.out.println(arrayList);
		// System.out.println(array[array.length - 1]);
		
		for (int i = 1; i < 3; i++) {

			arrayList.set(i - 1, array[array.length - i]);
			System.out.println(arrayList);
		//	int p = 0;
			System.out.println(p);
			System.out.println(array[p]);

			arrayList.set(array.length - i, array[p]);
			System.out.println(arrayList);
			//p=p+1;
			p++;
			//System.out.println(p);
			//System.out.println(arrayList);

		}
		// System.out.println(arrayList);

	}

}
