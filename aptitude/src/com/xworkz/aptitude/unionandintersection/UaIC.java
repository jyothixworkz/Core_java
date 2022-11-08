package com.xworkz.aptitude.unionandintersection;

import java.util.HashSet;

public class UaIC {
	
	
	public static void  uai(int[] array,int[] array2) {
		  HashSet<Object> hashSet = new HashSet<>();
		  for(int i =0; i<array.length;i++) {
			  
			 hashSet.add(array[i]); 
		  }
		
		  for(int i =0; i<array2.length;i++) {
			  
				 hashSet.add(array2[i]); 
			  }
			
		
		System.out.println(hashSet);
		hashSet.clear();
		  for(int i =0; i<array.length;i++) {
			  
			 hashSet.add(array[i]); 
		  }
		  for(int i =0; i<array2.length;i++) {
			  if(hashSet.contains(array2[i])) {
				  System.out.print(array2[i]+" ");
			  }
			  }
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] array= {12,3,4,5,78,};
		int[] array2= {12,4,78,1,258,12};
		uai(array, array2);
	}

}
