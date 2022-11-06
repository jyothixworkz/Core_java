package com.xworkz.thread;

public class ManojThread extends Thread {

	public ManojThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(" thrad is running");
		currentThread().setName("manoj");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentThread().getName());
	}/*
		 * void manoj(){
		 * 
		 * System.out.println(" main thread");
		 * System.out.println(currentThread().getName()); }
		 */

}
