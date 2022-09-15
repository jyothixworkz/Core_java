package com.xworkz.pubmanagement;

import com.xworkz.pubrules.PubRules;

public class PubManagement {
	private PubRules pubRules;

	public PubManagement(PubRules pubRules) {
		this.pubRules = pubRules;
	}
	 public void check() {
		boolean age = this.pubRules.age();
		boolean dressCode = this.pubRules.dressCode();
		boolean girlFriend = this.pubRules.girlFriend();
		
		if(age&&dressCode&&girlFriend) {
			System.out.println("rules are followed");
			
		}
		else {
			System.out.println("rules are not followed");
		}
		
		
		
	}

}
