/**
 * 
 */
package com.javabrains.tutorial09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 * Tutorial 09 - Demo Class for Initializing Collections
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle09");
		triangle.draw();
	}

}
