package com.designpatterns.creationalpatterns.simplefactory;


/**
 * <p>
 * �򵥹���������
 * <p>
 * �ѱ仯�Ĳ���(��������)��װ��������ͨ������(factory)�������������ϸ�ڡ�
 * <p>
 * �򵥹�����������һ�����ģʽ������һ�ֱ��ϰ�ߡ�
 * 
 * Reference : Head-First-Design-Patterns
 *
 */

public class SimplePizzaFactory {
	
	/**
	 * ����ʵ�����ʹ�����Ӧ�Ķ���
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
