package com.designpatterns.structuralpatterns.adapter;
/**
 * 4. Client
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class TurkeyTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
