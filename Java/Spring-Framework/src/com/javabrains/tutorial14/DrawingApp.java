/**
 * 
 */
package com.javabrains.tutorial14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 * Spring Tutorial 14 - Demo class for Lifecycle Callbacks
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle =(Triangle) context.getBean("triangle-14");
		triangle.draw();
		
	}

}
