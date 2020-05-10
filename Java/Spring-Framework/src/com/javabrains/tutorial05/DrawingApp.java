/**
 * 
 */
package com.javabrains.tutorial05;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author i80779
 *
 */
public class DrawingApp {
	
	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring-tutorial05.xml"));
		//Triangle triangle = (Triangle)factory.getBean("triangle");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-tutorial05.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		/* Create 2nd Triangle Object */
		Triangle tr02 = context.getBean("triangle", Triangle.class);
		tr02.draw();
	}

}
