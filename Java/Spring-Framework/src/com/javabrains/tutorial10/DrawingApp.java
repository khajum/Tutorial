/**
 * 
 */
package com.javabrains.tutorial10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 * Spring Tutorial 10 - Demo class Bean Autowiring
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle =(Triangle) context.getBean("triangle10");
		triangle.draw();
		
	}

}
