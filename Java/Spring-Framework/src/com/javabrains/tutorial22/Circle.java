package com.javabrains.tutorial22;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	
	private Point center;

	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	@Required /* for tutorial 18 */	
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle...");
		System.out.println("Circle: Point is: (" + center.getX()+ ", "+ center.getY() +")");
		
	}

}
