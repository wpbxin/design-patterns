package com.designpatterns.structuralpatterns.adapter;

/**
 * 4. Adapter
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void setTurkey(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
