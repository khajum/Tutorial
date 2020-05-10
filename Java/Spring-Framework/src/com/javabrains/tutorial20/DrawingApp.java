/**
 * 
 */
package com.javabrains.tutorial20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 * Spring Tutorial 18 - Demo class for code to interface
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial20.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	
		
	}

}
