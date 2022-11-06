package com.xworkz.arraylimitation;

  class ArrayLimitation extends Object {
static	int i[]= {1,2,3};
//i=new int[10];
	//int[] i= {1,2,3};
int m ;  
   ArrayLimitation(int x){
	 this.m=x;
}
   
public static void main(String[] args) {
	ArrayLimitation limitation = new ArrayLimitation(10);
	//i=new int[3];
//		int i[];// array declaration
//		i=new int[3];// creation 
//		i[0]=10;
//		i[1]=20;
//		try {
//			i[3]=30;
//		}
//		catch (RuntimeException e) {
//			try {
//			System.out.println("basu");
//			i[4]=30;
//			}
//			catch (RuntimeException k) {
//				i[2]=30;
//			}
//			
//		}
//		finally {
//			System.out.println("basu");
//		}
		
		
		System.out.println(i[0]+" "+i[1]+" "+i[2]);
		
		
	}

}
