package com.durgasoft.springioc_16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-ioc16.xml");
		Car car = (Car) context.getBean("car");
		car.printData();
	}

}
