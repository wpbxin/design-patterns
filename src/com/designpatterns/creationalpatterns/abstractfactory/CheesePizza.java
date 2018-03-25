package com.designpatterns.creationalpatterns.abstractfactory;

/**
 * 
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		cheese = ingredientFactory.createCheese();
	}
}
