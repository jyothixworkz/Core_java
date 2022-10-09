package com.xworkz.xworkzodc;

import java.util.TreeMap;
import java.util.TreeSet;

public class XWorkOdcRunner {
	public static void main(String[] args) {
		XWorkzOdc xWorkzOdc = new XWorkzOdc(10000, "malathesh");
		XWorkzOdc xWorkzOdc2 = new XWorkzOdc(200, "manoj");
		XWorkzOdc xWorkzOdc3 = new XWorkzOdc(23, "nandan");
		TreeSet treeset = new TreeSet();
	treeset.add(xWorkzOdc);
	treeset.add(xWorkzOdc2);
	treeset.add(xWorkzOdc3);
	System.out.println(treeset);
	String s="manoj";
	String s1="manoj";
	System.out.println(s1);
//	s1=s1.concat("ban");
	String s11="beg";
	System.out.println(s11);
	}

}
