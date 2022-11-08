package com.xworkz.aptitude.ownmutable;

public class Imm {

	private int i;

	public Imm(int i) {
		super();
		this.i = i;
	}

	public Imm getI(int i) {
		if(this.i==i) {
			
			return this;
		}
		
		
		return new Imm(i);
	}

}
