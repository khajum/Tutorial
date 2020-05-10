/**
 * 
 */
package com.javabrains.tutorial06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial06.xml");
		Triangle triangle = (Triangle) context.getBean("triangle06");
		triangle.draw();
		
		Person person = context.getBean("person", Person.class);
		person.show();
		
	}

}
