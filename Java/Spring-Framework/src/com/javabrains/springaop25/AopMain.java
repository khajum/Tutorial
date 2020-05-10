package com.javabrains.springaop25;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		PropertyConfigurator.configure("src/resources/log4j.properties");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop25.xml");
		ShapeService ss =  (ShapeService) context.getBean("cs");
		
		ss.getCircle().getName();
		//ss.getTriangle().getName();
		
		//ss.getTriangle().setName("Equilateral Triangle");
		
		//ss.getTriangle().runtimeException();
		
		// Tutorial - 33
		//ss.showDetails();
		
		// Tutorial - 33
		//ss.getTriangle().setName("Isosceles Triangle.");
		//ss.showDetails();

	}

}
