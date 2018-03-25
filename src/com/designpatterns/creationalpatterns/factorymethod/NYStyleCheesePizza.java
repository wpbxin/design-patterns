package com.designpatterns.creationalpatterns.factorymethod;

/**
 * This is the concrete product.
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}
