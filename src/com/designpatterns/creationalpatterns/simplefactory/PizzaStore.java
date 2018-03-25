package com.designpatterns.creationalpatterns.simplefactory;


/**
 * 
 * Reference : Head-First-Design-Patterns
 *
 */
public class PizzaStore {
	SimplePizzaFactory factory;
	 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;

		/**
		 * <p>
		 * ����ԭ���ǹ��������д���Pizza�Ĺ��̣���factory�����˷�װ
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
