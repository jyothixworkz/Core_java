package com.xworkz.abstractdemo;

public abstract class Abstract {
	int i=10;
	int i1;
	
	public int p=10;

	public Abstract() {
		super();
		System.out.println(" default constructer of abstract class");
	}

	public Abstract(int i, int i1, int p) {
		this();
		this.i = i;
		this.i1 = i1;
		this.p = p;
	}



	
	

}
