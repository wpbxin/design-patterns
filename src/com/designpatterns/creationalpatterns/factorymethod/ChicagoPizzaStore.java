package com.designpatterns.creationalpatterns.factorymethod;

/**
 * This is the concrete factory-method.
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	// Here is the concrete creator.
	@Override
	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else
			return null;
	}

}
