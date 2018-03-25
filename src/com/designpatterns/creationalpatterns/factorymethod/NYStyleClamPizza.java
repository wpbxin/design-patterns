package com.designpatterns.creationalpatterns.factorymethod;

/**
 * This is the concrete product.
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class NYStyleClamPizza extends Pizza{
	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
