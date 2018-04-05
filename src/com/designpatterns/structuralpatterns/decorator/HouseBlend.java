package com.designpatterns.structuralpatterns.decorator;

/**
 * <p>
 * 2. ConcreteComponent
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}
}
