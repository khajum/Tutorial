package com.durgasoft.springioc_24;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarFactoryClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc24.xml");
		//Car car = (Car) context.getBean("car-factory");
		//Car car = (Car) context.getBean("cf2");
		Car car = (Car) context.getBean("cfb");
		car.drive();
		
		
	}

}
