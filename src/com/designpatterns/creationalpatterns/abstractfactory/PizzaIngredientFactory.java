package com.designpatterns.creationalpatterns.abstractfactory;
/**
 * 
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public interface PizzaIngredientFactory {
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Clams createClam();
}
