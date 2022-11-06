package com.xworkz.aptitude.ownmutable;

public class MyOwnMuttable {

	private int i;

	public MyOwnMuttable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyOwnMuttable(int i) {
		super();
		this.i = i;
	}

	public MyOwnMuttable getI(int i) {

		if (i == this.i)
			return this;
		else
			return new MyOwnMuttable(i);
	}

	public static void main(String[] args) {
		MyOwnMuttable muttable = new MyOwnMuttable(10);
		MyOwnMuttable muttable1 = new MyOwnMuttable(100);
		MyOwnMuttable muttable2 = new MyOwnMuttable(10);
		System.out.println(muttable == muttable1);
		System.out.println(muttable1 == muttable2);
		System.out.println(muttable2 == muttable);

	}

}
