package com.designpatterns.behavioralpatterns.strategy;
/**
 * <p>
 * 3. Context
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
