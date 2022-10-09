package com.xworkz.singleton;

public class OwnImmutable {
	private int i;

	public OwnImmutable(int i) {
		super();
		this.i = i;
	}
	public OwnImmutable getI(int i) {
		if(this.i==i) {
			return this;
		}
		else {
			return new OwnImmutable(i);
		}
		//sreturn i;
	}
	

}
