/**
 * 
 */
package com.javabrains.tutorial22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial22.xml");
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();
		
		System.out.println(context.getMessage("greeting.morning", null,
				"Default greeting", null));
		
		
	}

}
