package com.xworkz.pubrunner;

import com.xworkz.nightpub.NightPub;
import com.xworkz.pubmanagement.PubManagement;
import com.xworkz.pubrules.PubRules;

public class PubRunner {
	public static void main(String[] args) {
		String[] m;
		
		PubRules nightPub = new NightPub();
		PubManagement pubManagement = new PubManagement(nightPub);
		pubManagement.check();
	}

}
