package com.designpatterns.structuralpatterns.decorator;
/**
 * <p>
 * 1. Component
 * <p>
 * Reference : Head-First-Design-Patterns
 *
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
