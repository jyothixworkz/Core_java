package com.xworkz.aptitude.singleton;

public class S {
	private static final S s;

	public final S getS() {
		return s;
	}

	static {

		s = new S();

	}
}
