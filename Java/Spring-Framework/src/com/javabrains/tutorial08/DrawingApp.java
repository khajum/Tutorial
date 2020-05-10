/**
 * 
 */
package com.javabrains.tutorial08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author i80779
 *
 * Spring Tutorial 08 - Demo class for Inner Beans, Aliases and idref
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle =(Triangle) context.getBean("triangle08");
		triangle.draw();
		
		/* get bean object using Alias*/
		Triangle triangle2 =(Triangle) context.getBean("triangle08-alias");
		triangle2.draw();
		
	}

}
