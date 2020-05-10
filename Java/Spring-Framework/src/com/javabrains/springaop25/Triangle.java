/**
 * 
 */
package com.javabrains.springaop25;

/**
 * @author i80779
 *
 */
public class Triangle {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("Triangle getter called.");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("Triangle setter called.");
		this.name = name;
	}
	
	public void runtimeException() {
		System.out.println("Triangle runtime exception method called.");
		throw(new RuntimeException());
	}

}
