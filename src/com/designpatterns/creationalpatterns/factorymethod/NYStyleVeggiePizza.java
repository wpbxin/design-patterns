package com.designpatterns.creationalpatterns.factorymethod;

/**
 * This is the concrete product.
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class NYStyleVeggiePizza extends Pizza{
	public NYStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
