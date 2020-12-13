package com.ss.assignment4.deadlock;

public class Deadlock implements Runnable{

	public static void main(String[] args) {
		new Thread(new Deadlock("Thread 1")).start();
		new Thread(new Deadlock("Thread 2")).start();

	}
	
	public static final Object thread1 = new Object();
	public static final Object thread2 = new Object();
	
	public String thread;
	public Deadlock(String thread) {
		this.thread = thread;
	}
	@Override
	public void run() {
		try {
			synchronized(thread1) {
				Thread.sleep(500);
				synchronized(thread2) {
					System.out.println("Thread 1 is running");
				}
			}
			synchronized(thread2) {
				Thread.sleep(500);
				synchronized(thread1) {
					System.out.println("Thread 2 is running");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
