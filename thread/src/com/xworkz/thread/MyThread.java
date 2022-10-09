package com.xworkz.thread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		
	 currentThread().setName("m");
	 System.out.println(currentThread().getName());
	 long l = currentThread().getId();
	 System.out.println(l);
	 boolean m = currentThread().isAlive();
	 System.out.println(m);
		System.out.println("hello malatesh");
	}

}
