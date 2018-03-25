package com.designpatterns.creationalpatterns.singleton;

/**
 * <p>
 * NOTE: This is not thread safe!
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class ClassicSingleton {
	private static ClassicSingleton uniqueInstance;
	 
	private ClassicSingleton() {}
 
	//not thread safe
	public static ClassicSingleton getInstance() {
		if (null == uniqueInstance) {
			uniqueInstance = new ClassicSingleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic ClassicSingleton!";
	}
}