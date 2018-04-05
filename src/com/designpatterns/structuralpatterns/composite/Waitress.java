package com.designpatterns.structuralpatterns.composite;
/**
 * <p>
 * 4. Client
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
