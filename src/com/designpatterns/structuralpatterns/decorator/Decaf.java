package com.designpatterns.structuralpatterns.decorator;

/**
 * <p>
 * 2. ConcreteComponent
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		return 1.05;
	}
}
