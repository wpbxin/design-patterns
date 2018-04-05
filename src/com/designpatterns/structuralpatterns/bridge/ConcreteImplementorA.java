package com.designpatterns.structuralpatterns.bridge;
/**
 * 4. ConcreteImplementor
 * <p>
 * @author WPB
 *
 */
public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("Hello, this is ConcreteImplementorA.");

	}

}
