/**
 * 
 */
package com.javabrains.springaop25;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author i80779
 *
 */
public class ShapeService {
	private static Logger logger = null;
	
	private Circle circle;
	private Triangle triangle;
	/**
	 * @return the circle
	 */
	public Circle getCircle() {
		return circle;
	}
	/**
	 * @param circle the circle to set
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	/**
	 * @return the triangle
	 */
	public Triangle getTriangle() {
		return triangle;
	}
	/**
	 * @param triangle the triangle to set
	 */
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	@Loggable
	public void showDetails() {
		
		System.out.println("Circle name:" + getCircle().getName());
		System.out.println("Triangle name: "+getTriangle().getName());
		
	}
	

}
