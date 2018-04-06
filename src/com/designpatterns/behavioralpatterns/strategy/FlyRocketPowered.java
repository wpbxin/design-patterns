package com.designpatterns.behavioralpatterns.strategy;
/**
 * <p>
 * 2. ConcreteStrategy
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
