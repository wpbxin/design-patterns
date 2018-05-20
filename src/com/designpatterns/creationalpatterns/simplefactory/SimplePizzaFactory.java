package com.designpatterns.creationalpatterns.simplefactory;


/**
 * <p>
 * 简单工厂方法：
 * <p>
 * 把变化的部分(创建对象)封装起来，即通过工厂(factory)来处理创建对象的细节。
 * <p>
 * 简单工厂方法不是一种设计模式，而是一种编程习惯。
 * 
 * Reference : Head-First-Design-Patterns
 *
 */

public class SimplePizzaFactory {
	
	/**
	 * 根据实际类型创建相应的对象
	 * @param type
	 * @return
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
