package com.designpatterns.structuralpatterns.bridge;

/**
 * 1. Abstraction ∂®“Â
 * <p>
 * @author WPB
 *
 */

public abstract class Abstraction {
	private Implementor implementor;
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	public Implementor getImplementor() {
		return implementor;
	}
	public abstract void operation();
}
