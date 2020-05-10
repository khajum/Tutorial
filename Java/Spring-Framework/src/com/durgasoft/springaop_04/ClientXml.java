package com.durgasoft.springaop_04;

import javax.security.auth.login.LoginException;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientXml {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring-aop_04.xml");
		Bank bank = (Bank) context.getBean("pfb");
		
		int amount = bank.deposit("012NIBL", 5000);
		System.out.println(amount);
	}

}
