package com.xworkz.opps.overloading;

public class OverLoadingCase5 {
public void	m1(int i, float f){
		
		System.out.println("int and float");
	}
public void	m1(float f, int i){
	System.out.println("float and int");
	
	
}
public static void main(String[] args) {
	
	OverLoadingCase5 case5 = new OverLoadingCase5();
	case5.m1(10, 10.00f);
	case5.m1(10.00f, 10);
	//case5.m1(10, 10);// ambiguety 
//	case5.m1(10.0f, 10.0f); no mathod matched
}

}
