package com.designpatterns.structuralpatterns.adapter;

import java.util.Random;

/**
 * 4. Adapter
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}

	public void setDuck(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if (rand.nextInt(5) == 0) {
			duck.fly();
		}
	}
}
