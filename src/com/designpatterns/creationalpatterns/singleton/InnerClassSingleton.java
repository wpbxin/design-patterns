package com.designpatterns.creationalpatterns.singleton;
/**
 * 
 * Loaded by inner class when needed. 
 *
 */
public class InnerClassSingleton {
	private InnerClassSingleton() {}

    public static InnerClassSingleton getInstance() {
        return Nested.instance;
    }

    private static class Nested {
        public static InnerClassSingleton instance = new InnerClassSingleton();
    }
}
