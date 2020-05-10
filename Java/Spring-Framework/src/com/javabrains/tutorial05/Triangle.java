/**
 * 
 */
package com.javabrains.tutorial05;

/**
 * @author i80779
 *
 */
public class Triangle {
	
	
	public Triangle() {
		System.out.println("Triangle Constructor called.");
	}

	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle drawn");
	}

}
