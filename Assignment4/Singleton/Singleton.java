package com.ss.assignment4.singleton;

/**
 * 
 * @author yashe
 * Singleton class with double checked locking
 * 
 */
public class Singleton {
	// declaring volatile for thread safety
	private static volatile Singleton instance;
	
	private String str;
	private Singleton(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str;
	}
	
	// only one instantiation is needed for this object
	private Singleton() {}
	
	public static Singleton getInstance() {
		// check for existing instance before thread lock
		if (instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
