package com.designpatterns.behavioralpatterns.strategy;
/**
 * <p>
 * 3. Context
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
