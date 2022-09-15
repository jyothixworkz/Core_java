package com.xworkz.xworkz.omkarxworkz;

import com.xworkz.xworkz.xworkzrule.XWorkzRule;

public class OmkarXWorkz implements XWorkzRule {

	@Override
	public boolean payFee() {
		System.out.println("paying fee is compulsory");

		return true;
	}

	@Override
	public boolean wearTshirt() {
		System.out.println("wearing tshirt is compulsory");

		return true;
	}

	@Override
	public boolean compliteTask() {
		System.out.println("complite task is compulsory");

		return true;
	}

}
