package com.xworkz.stringclass;

public class CheckPollindrome {
	
	public static void main(String[] args) {
		
	         // String name="manoj";
	          
		boolean checkPollindrom = checkPollindrom("mam");
		System.out.println(checkPollindrom);
		
		
		
	}
	
	
	static boolean checkPollindrom(String str) {
		 StringBuffer stringBuffer = new StringBuffer(str);
		 StringBuffer reverse = stringBuffer.reverse();
		// System.out.println(reverse);
		 String string = stringBuffer.toString();
		 System.out.println(reverse.toString());
		  if(str.equals(string)) {
			  return true;
		  }
		  else {
			  return false;
		  }
		 
	 }
	
}
