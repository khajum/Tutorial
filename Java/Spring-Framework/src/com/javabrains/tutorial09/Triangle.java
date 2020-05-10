/**
 * 
 */
package com.javabrains.tutorial09;

import java.util.List;

/**
 * @author i80779
 *
 */
public class Triangle {
	
	private List<Point> points;
	
	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		
		for(Point point : points) {
			System.out.println("Point = (" + point.getX() + ", "+point.getY() +")");
		}
	}

}
