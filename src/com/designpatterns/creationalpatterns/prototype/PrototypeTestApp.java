package com.designpatterns.creationalpatterns.prototype;


import java.util.ArrayList;

/**
 * 
 * @author WPB
 *
 */
public class PrototypeTestApp {
	public static void main(String[] args) throws CloneNotSupportedException {
		Title title = new Title("Mr", "Doc");
		Name name = new Name("San", "Li", title);
		ArrayList<String> arrayList;
		Name nameClone = name.clone();

		System.out.println("name != nameClone: " + (name != nameClone));	// true,不同的对象引用
		System.out.println("name,.getClass() == nameClone .getClass(): " + (name.getClass() == nameClone.getClass()));	// true,类型一致
		System.out.println("name.equals(nameClone): " + name.equals(nameClone));	// false,不同的对象引用

		System.out.println(nameClone.getFirstName() == name.getFirstName());	// true,不可变对象复制引用
		System.out.println(nameClone.getLastName() == name.getLastName());		// true,不可变对象复制引用
		System.out.println(nameClone.getTitle() == name.getTitle());			// false,可变对象深度克隆，地址不一样
		System.out.println(nameClone.getTitle().getPre() == name.getTitle().getPre());		// true,不可变对象复制引用
		System.out.println(nameClone.getTitle().getTitle() == name.getTitle().getTitle());	// true,不可变对象复制引用
	}
}
