package com.durgasoft.springioc_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/resources/spring-ioc04.xml");
		Person person = (Person) context.getBean("person");
		person.showDetails();
		
		Person person2 = context.getBean("person", Person.class);
		person2.showDetails();
	}

}
