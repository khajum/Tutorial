package com.durgasoft.ioc_02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Clients {
	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc02.xml");
		
		Resource resource = new ClassPathResource("/resources/spring-ioc02.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		factory.getBean("test");
		factory.getBean("test");
		factory.getBean("test");
	}

}
