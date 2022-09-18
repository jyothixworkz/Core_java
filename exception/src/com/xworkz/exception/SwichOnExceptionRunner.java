package com.xworkz.exception;

public class SwichOnExceptionRunner {
	public static void main(String[] args) {
		boolean current = true;
		if (!current) {
			System.out.println(" switch on the laptop");
		} else {
			
			throw new SwichOnException("there is no current");
		}

	}

}
