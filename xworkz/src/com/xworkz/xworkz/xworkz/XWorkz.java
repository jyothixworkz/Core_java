package com.xworkz.xworkz.xworkz;

import com.xworkz.xworkz.omkarxworkz.OmkarXWorkz;
import com.xworkz.xworkz.xworkzrule.XWorkzRule;

public class XWorkz {
	private XWorkzRule rule;

	public XWorkz(XWorkzRule rule) {
		this.rule = rule;

	}

	public void checkRules() {
		boolean compliteTask = this.rule.compliteTask();
		boolean payFee = this.rule.payFee();
		boolean wearTshirt = this.rule.wearTshirt();

		if (payFee && wearTshirt && compliteTask) {
			System.out.println("rules are followed");
		} else {
			System.out.println("rules r not followed");
		}

	}

}
