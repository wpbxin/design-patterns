package com.designpatterns.creationalpatterns.singleton;
/**
 * <p>
 * NOTE: This is thread safe!
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton uniqueInstance;
	 
	// other useful instance variables here
 
	private ThreadSafeSingleton() {}
 
	public static synchronized ThreadSafeSingleton getInstance() {
		if (null == uniqueInstance) {
			uniqueInstance = new ThreadSafeSingleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe ThreadSafeSingleton!";
	}
}
