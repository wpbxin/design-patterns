package com.designpatterns.creationalpatterns.prototype;
/**
 * 
 * @author WPB
 *
 */
public class PrototypeTestApp {
	public static void main(String[] args) throws CloneNotSupportedException {
		Title title = new Title("Mr", "Doc");
		Name name = new Name("San", "Li", title);
		
		Name nameClone = name.clone();
		
		System.out.println(nameClone.getFirstName() == name.getFirstName());
		System.out.println(nameClone.getLastName() == name.getLastName());
		System.out.println(nameClone.getTitle() == name.getTitle());
		System.out.println(nameClone.getTitle().getPre() == name.getTitle().getPre());
		System.out.println(nameClone.getTitle().getTitle() == name.getTitle().getTitle());
	}
}
