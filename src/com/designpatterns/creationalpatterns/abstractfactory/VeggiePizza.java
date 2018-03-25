package com.designpatterns.creationalpatterns.abstractfactory;
/**
 * 
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class VeggiePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
