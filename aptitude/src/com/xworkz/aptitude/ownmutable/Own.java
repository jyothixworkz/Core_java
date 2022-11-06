package com.xworkz.aptitude.ownmutable;

public class Own {
	private int i;

	public Own(int i) {
		super();
		this.i = i;
	}
	public Own getI(int i) {
		if(this.i==i) {
			return this;
		}
		else {
		return new Own(i);
		}
	}
	

}
