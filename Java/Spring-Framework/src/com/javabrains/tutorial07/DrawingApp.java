/**
 * 
 */
package com.javabrains.tutorial07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 * Spring Tutorial 07 - Demo class for Injecting Object
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle =(Triangle) context.getBean("triangle07");
		triangle.draw();
	}

}
