package com.designpatterns.creationalpatterns.singleton;
/**
 * <p>
 * NOTE: A double check locking make it thread safe!
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class DoubleCheckLockingSingleton {
	private volatile static DoubleCheckLockingSingleton uniqueInstance;
	 
	private DoubleCheckLockingSingleton() {}
 
	public static DoubleCheckLockingSingleton getInstance() {
		if (null == uniqueInstance) {
			synchronized (DoubleCheckLockingSingleton.class) {
				if (null == uniqueInstance) {
					uniqueInstance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
