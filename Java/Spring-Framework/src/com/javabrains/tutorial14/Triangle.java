/**
 * 
 */
package com.javabrains.tutorial14;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author i80779
 *
 */
public class Triangle  implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		
		System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean distroy method called for Triangle.");
		
	}
	
	
	public void myInit() {
		System.out.println("myInit method called for Triangle.");
	}
	
	public void cleanUp() {
		System.out.println("cleanUp method called for Triangle.");
	}
}
