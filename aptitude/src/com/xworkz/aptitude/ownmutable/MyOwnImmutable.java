package com.xworkz.aptitude.ownmutable;

public class MyOwnImmutable {
	private int i;

	public MyOwnImmutable(int i) {
		super();
		this.i = i;
	}

	public MyOwnImmutable getI(int i) {

		if (this.i == i) {
			return this;
		} else {
			return new MyOwnImmutable(i);
		}
		// return i;
	}

	public static void main(String[] args) {
		MyOwnImmutable myOwnImmutable = new MyOwnImmutable(10);
		MyOwnImmutable i2 = myOwnImmutable.getI(100);
		MyOwnImmutable i3 = myOwnImmutable.getI(10);
		System.out.println(myOwnImmutable == i2);
		System.out.println(myOwnImmutable == i3);

		String manoj = "MANOJ MAN.OJ MANOJ";
		String replace = manoj.replace('M', 'j');
		System.out.println(replace);
		String[] split = manoj.split("O");

		
		System.out.println(manoj.length());
		for (int i = 0; i < split.length; i++) {
		
			System.out.println(split[i]);
		}
		

	}

}
