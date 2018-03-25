package com.designpatterns.creationalpatterns.abstractfactory;
/**
 * 
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	
	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Onion(), new Garlic()};
		return veggies;
	}
	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
