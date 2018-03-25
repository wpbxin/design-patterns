package com.designpatterns.creationalpatterns.prototype;
/**
 * 
 * @author WPB
 *
 */
public class Name implements Cloneable{
	private String firstName;
	private String lastName;
	private Title title;
	//Constructor with no arguments
	public Name(){
		
	}
	//Constructor with all arguments
	public Name(String firstName, String lastName, Title title) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}
	//all getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	@Override
	public Name clone() throws CloneNotSupportedException {
		Name nameClone = (Name)super.clone();
		nameClone.setFirstName(new String(this.getFirstName()));
		nameClone.setLastName(new String(this.getLastName()));
		nameClone.setTitle(this.getTitle().clone());
		return nameClone;
	}

}
