package com.designpatterns.structuralpatterns.decorator;

/**
 * <p>
 * 2. ConcreteComponent
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return .99;
	}
}
