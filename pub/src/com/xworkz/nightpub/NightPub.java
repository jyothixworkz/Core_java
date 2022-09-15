package com.xworkz.nightpub;

import com.xworkz.pubrules.PubRules;

public class NightPub implements PubRules {

	@Override
	public boolean dressCode() {
		System.out.println("dress should be modern");
		return true;
	}

	@Override
	public boolean age() {
		int age = 25;
		if (age > 18) {
			System.out.println("age must be grater then 18 years ");
			return true;

		}
		else {
			System.out.println("age is less than 18 years ");
			return false;
		}
	}

	@Override
	public boolean girlFriend() {
		System.out.println("girlfriend is manditory");
		return true;
	}

}
