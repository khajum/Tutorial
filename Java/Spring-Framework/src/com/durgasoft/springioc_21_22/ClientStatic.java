package com.durgasoft.springioc_21_22;

import java.awt.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientStatic {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc22.xml");
		//Car car = (Car) context.getBean(Car.class);
		StaticCar car = (StaticCar) context.getBean("static-car");
		car.showDetails();
		
	}

}
