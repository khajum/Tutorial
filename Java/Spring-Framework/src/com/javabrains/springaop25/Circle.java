package com.javabrains.springaop25;

public class Circle {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("Circle getter called.");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("Circle setter called.");
		this.name = name;
	}
	

}
