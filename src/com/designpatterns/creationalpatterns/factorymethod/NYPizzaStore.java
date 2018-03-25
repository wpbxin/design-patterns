package com.designpatterns.creationalpatterns.factorymethod;

/**
 * This is the concrete factory-method.
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class NYPizzaStore extends PizzaStore {

	// Here is the concrete creator.
	@Override
	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else
			return null;
	}

}
