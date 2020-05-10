package com.durgasoft.springioc_21_22;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc21.xml");
		//Car car = (Car) context.getBean(Car.class);
		Car car = (Car) context.getBean("car");
		car.showDetails();
	}

}
