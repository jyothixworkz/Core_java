package com.xworkz.aptitude.stringaptitude;

import java.util.Scanner;

public class PolStr {
static	Boolean pol(String str) {
	
	StringBuffer stringBuffer = new StringBuffer(str);
	StringBuffer reverse = stringBuffer.reverse();
	String string = reverse.toString();
	
	if(string.equals(str)) {
		return true;
		
	}
	return false;
			
	
	
}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" enter the string value");
	String next = scanner.next();
	Boolean pol = pol(next);
	System.out.println(pol);
	
}
			

}
