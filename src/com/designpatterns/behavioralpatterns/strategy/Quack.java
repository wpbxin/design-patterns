package com.designpatterns.behavioralpatterns.strategy;
/**
 * <p>
 * 2. ConcreteStrategy
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
