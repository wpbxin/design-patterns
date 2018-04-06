package com.designpatterns.behavioralpatterns.strategy;
/**
 * <p>
 * 2. ConcreteStrategy
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
