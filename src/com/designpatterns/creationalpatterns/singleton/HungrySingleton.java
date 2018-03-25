package com.designpatterns.creationalpatterns.singleton;
/**
 * <p>
 * NOTE: The Instance is initialized when the class is loaded
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class HungrySingleton {
	
	private static HungrySingleton uniqueInstance = new HungrySingleton();
	 
	private HungrySingleton() {}
 
	public static HungrySingleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
