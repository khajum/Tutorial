package com.durgasoft.springioc_35;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-ioc_35.xml");
		DataBaseConnection db = (DataBaseConnection) context.getBean("cp");				
		db.getConnection();
	}

}
