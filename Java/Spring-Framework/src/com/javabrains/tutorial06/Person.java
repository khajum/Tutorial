/**
 * 
 */
package com.javabrains.tutorial06;

import com.sun.javafx.stage.EmbeddedWindow;

/**
 * @author i80779
 *
 */
public class Person {
	int age;
	String name;
	String email;
	
	public Person(int age, String name, String email) {
		super();
		this.age = age;
		this.name = name;
		this.email = email;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void show() {
		System.out.println("Person Details: \nName: "+name+", Age:"+age+", Email:"+email);
	}
	
	

}
