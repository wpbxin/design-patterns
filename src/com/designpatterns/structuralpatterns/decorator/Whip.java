package com.designpatterns.structuralpatterns.decorator;

/**
 * <p>
 * 4. ConcreteDecorator
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
