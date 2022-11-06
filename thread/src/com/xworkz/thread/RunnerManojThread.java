package com.xworkz.thread;

public class RunnerManojThread {
	private int m;
	private int b;

	public static void main(String[] args) {
		ManojThread thread = new ManojThread();
		ManojThread manojThread = new ManojThread();
		thread.start();
		// System.out.println(thread.isAlive());
		// System.out.println(thread.getPriority());
		// System.out.println();
		// thread.manoj();
		manojThread.start();
		/*
		 * manojThread.start(); manojThread.start(); manojThread.start();
		 * manojThread.start(); manojThread.start(); manojThread.start();
		 * manojThread.start(); manojThread.start(); manojThread.start();
		 */
		RunnerManojThread thread2 = new RunnerManojThread(10, 0);
		thread2.setB(200);
		int b2 = thread2.getB();
		System.out.println(b2);
		System.out.println(thread2);

		try {
			manojThread.sleep(1000000000);
			manojThread.start();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public RunnerManojThread(int m, int b) {
		super();
		this.m = m;
		this.b = b;
	}

	public RunnerManojThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "RunnerManojThread [m=" + m + ", b=" + b + "]";
	}

	/*
	 * @Override public String toString() { return "RunnerManojThread [m=" + m +
	 * "]"; }
	 */

}
