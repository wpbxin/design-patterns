package com.designpatterns.creationalpatterns.abstractfactory;
/**
 * 
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class ClamPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	 
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
