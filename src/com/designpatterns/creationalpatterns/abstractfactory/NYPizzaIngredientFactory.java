package com.designpatterns.creationalpatterns.abstractfactory;
/**
 * 
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	
	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom()};
		return veggies;
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
}
