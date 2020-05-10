/**
 * 
 */
package com.javabrains.tutorial13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 * Spring Tutorial 13 - Demo class for ApplicationContextAware
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle =(Triangle) context.getBean("triangle-13");
		triangle.draw();
		
	}

}
