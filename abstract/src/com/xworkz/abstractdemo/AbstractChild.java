package com.xworkz.abstractdemo;

public class AbstractChild extends Abstract {
	int k;

	public AbstractChild(int k) {
		super();
		System.out.println("mine child");
		this.k = k;
	}

	public AbstractChild(int i, int i1, int p) {
		super(i, i1, p);

		// TODO Auto-generated constructor stub
	}

	public AbstractChild() {
		super();
		System.out.println("child no args"); //
		// TODO Auto-generated constructor stub
	}

}
