package com.xworkz.practiceaptitude;

public class StringReversePlolindromeDemo {
	public static void main(String[] args) {
		System.out.println(checkPollindrome("manoj"));
		System.out.println(checkPollindrome("mam"));
		System.out.println(checkPollindrome("mama"));
		System.out.println(checkPollindrome("sasa"));
		System.out.println(checkPollindrome("sas"));
		
	}
		
		public static boolean checkPollindrome(String str) {
			
		
		StringBuffer stringBuffer = new StringBuffer(str);
		
		stringBuffer.reverse();
		String string = stringBuffer.toString();
		if(string.equals(str)) {
			return string.equals(str);
		}
		
		return false;
	}

}
