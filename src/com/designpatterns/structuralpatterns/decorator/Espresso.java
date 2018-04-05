package com.designpatterns.structuralpatterns.decorator;

/**
 * <p>
 * 2. ConcreteComponent
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
