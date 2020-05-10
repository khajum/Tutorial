package com.durgasoft.annotation.springioc_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-ioc19.xml");
		Bus bus = (Bus) context.getBean("bus");
		bus.showDetails();
		
	}

}
