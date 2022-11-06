package com.xworkz.aptitude.ownmutable;

public class Im {
	private int i;

	public Im(int i) {
		super();
		this.i = i;
	}

	public Im getI(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new Im(i);

		}
	}

}
