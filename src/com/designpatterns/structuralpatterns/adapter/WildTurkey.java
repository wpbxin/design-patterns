package com.designpatterns.structuralpatterns.adapter;

/**
 * 1. Target or 3. Adaptee - implements
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class WildTurkey implements Turkey {
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
