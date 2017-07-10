package com.mt.javatpoint;

public class RunnableDemo implements Runnable {

	private String threadName;

	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 1; i < 5; i++) {
				System.out.println("Thread: " + threadName + ", " + i + " itration");
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public static void main(String args[]) {
		new Thread(new RunnableDemo("Thread 1")).start();
		new Thread(new RunnableDemo("Thread 2")).start();
	}
}