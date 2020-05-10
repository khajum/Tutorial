package com.durgasoft.springioc_28;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws SQLException {
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc28.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc28.xml");
		
		// Bean Life Cycle using Implementation
		//BeanLifeCycle beanLifeCycle= (BeanLifeCycle) context.getBean("blc");
		
		// Bean Life Cycle using Implementation
		//BeanLifeCycleDeclarative beanLifeCycle= (BeanLifeCycleDeclarative) context.getBean("blc-dcl");

		// Bean Life Cycle using Implementation
		BeanLifeCycleAnnotation beanLifeCycle= (BeanLifeCycleAnnotation) context.getBean("blc-annot");
				
		beanLifeCycle.save(10, "Ram Limbu", "Ram.Limbu@verscend.com", "Kathmandu");
	
	}

}
