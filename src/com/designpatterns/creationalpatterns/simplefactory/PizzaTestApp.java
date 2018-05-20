package com.designpatterns.creationalpatterns.simplefactory;

/**
 * 
 * Reference : Head-First-Design-Patterns
 *
 */

public class PizzaTestApp {
	public static void main(String[] args) {
		//创建工厂
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		
		//order a pizza
		Pizza pizza = pizzaStore.orderPizza("clam");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		
		//change the pizza type
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		
	}
}
