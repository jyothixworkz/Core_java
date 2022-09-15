package com.xworkz.xworkz;

import com.xworkz.xworkz.omkarxworkz.OmkarXWorkz;
import com.xworkz.xworkz.xworkz.XWorkz;
import com.xworkz.xworkz.xworkzrule.XWorkzRule;

public class XWorkzRunner {

	public static void main(String[] args) {
		XWorkzRule xWorkz = new OmkarXWorkz();
		XWorkz xWorkz2 = new XWorkz(xWorkz);
		xWorkz2.checkRules();

	}

}
