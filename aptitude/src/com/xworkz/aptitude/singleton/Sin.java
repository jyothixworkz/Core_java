package com.xworkz.aptitude.singleton;

public  final class Sin {
	private final static Sin sin;

	public final static Sin getSin() {
		return sin;
	}

	static {

		sin = new Sin();
	}

}
