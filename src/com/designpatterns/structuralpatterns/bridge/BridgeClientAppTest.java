package com.designpatterns.structuralpatterns.bridge;
/**
 * Client Test
 * <p>
 * @author WPB
 *
 */
public class BridgeClientAppTest {

	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		
		Implementor implementor = new ConcreteImplementorA();
		abstraction.setImplementor(implementor);
		abstraction.operation();
		
		implementor = new ConcreteImplementorB();
		abstraction.setImplementor(implementor);
		abstraction.operation();
		
	}
}
