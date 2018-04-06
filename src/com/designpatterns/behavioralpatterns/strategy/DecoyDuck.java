package com.designpatterns.behavioralpatterns.strategy;
/**
 * <p>
 * 3. Context
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
