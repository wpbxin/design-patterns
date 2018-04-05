package com.designpatterns.structuralpatterns.decorator;

/**
 * <p>
 * 4. ConcreteDecorator
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
