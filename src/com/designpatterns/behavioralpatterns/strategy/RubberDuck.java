package com.designpatterns.behavioralpatterns.strategy;
/**
 * <p>
 * 3. Context
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
