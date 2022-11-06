package com.xworkz.overriding;

public class Rule1Run {
public static void main(String[] args) {
	Rule1 rule1 = new Rule1();
	rule1.m1();
	Rule1 rule = new Rule1Parent();
	rule.m1();
	
	Rule1Parent rule2 = new Rule1Parent();
	rule2.m1();
	
	
}
}
