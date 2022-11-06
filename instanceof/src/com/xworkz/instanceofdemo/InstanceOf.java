package com.xworkz.instanceofdemo;

public class InstanceOf {

	public static void main(String[] args) {
		Thread thread = new Thread();

		System.out.println(thread instanceof Object);
		System.out.println(null instanceof Thread);
	}
}
