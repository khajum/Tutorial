package com.durgasoft.springaop_05;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-aop_05.xml");
		Bank bank = (Bank) context.getBean("pfb");
		bank.deposit("012NIBL", 1000);
		bank.showBalance("012NIBL");

	}

}
