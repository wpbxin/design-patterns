package com.designpatterns.structuralpatterns.adapter;

/**
 * 1. Target or 3. Adaptee - implements
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class MallardDuck implements Duck {
	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
