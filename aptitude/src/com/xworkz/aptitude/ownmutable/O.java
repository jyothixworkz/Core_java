package com.xworkz.aptitude.ownmutable;

public class O {
	private int i;
	
	
	public O(int i) {
		super();
		this.i = i;
	}


	public O getI(int i) {
		if(this.i==i) {
			
			return this;
		}
		return new O(i);
	}
	

}
