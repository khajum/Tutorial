package com.durgasoft.springioc_17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-ioc17.xml");
		Car car = (Car) context.getBean("car");
		car.showDetails();
		
		Bus bus = (Bus) context.getBean("bus");
		bus.showDetails();

	}

}
