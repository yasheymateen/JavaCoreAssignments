package com.ss.assignment4.singleton;

public class SingletonImplementation implements Runnable {
	private Singleton single = Singleton.getInstance();
	
	@Override
	public void run() {
		System.out.println(single);
	}
	public static void main(String[] args) {
		Thread thread1 = new Thread(new SingletonImplementation());
		Thread thread2 = new Thread(new SingletonImplementation());
		System.out.println("Thread 1 Starting...");
		thread1.start();
		System.out.println("Thread 2 Starting...");
		thread2.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
