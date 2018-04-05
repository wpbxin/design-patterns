package com.designpatterns.structuralpatterns.bridge;

/**
 * 2. RefinedAbstraction ����
 * @author WPB
 *
 */
public class RefinedAbstraction extends Abstraction {

	@Override
	public void operation() {
		getImplementor().operationImpl();

	}

}
