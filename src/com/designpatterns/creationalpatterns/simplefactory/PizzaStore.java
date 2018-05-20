package com.designpatterns.creationalpatterns.simplefactory;


/**
 * 
 * Reference : Head-First-Design-Patterns
 *
 */
public class PizzaStore {
	/**
	 * 工厂类，负责处理创建对象的具体细节
	 */
	SimplePizzaFactory factory;
	 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
	public void setFactory(SimplePizzaFactory factory) {
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;

		/**
		 * <p>
		 * 这里原本是工厂方法中创建Pizza的过程，被factory进行了封装
		 * <p>
		 * Here we create the pizza with factory.
		 */
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
