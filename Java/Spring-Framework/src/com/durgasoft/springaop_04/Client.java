package com.durgasoft.springaop_04;

import javax.security.auth.login.LoginException;

import org.springframework.aop.framework.ProxyFactoryBean;

public class Client {

	public static void main(String[] args) {
		// create target
		Bank b = new Bank();
		
		// Create service
		LogExceptionService les = new LogExceptionService();
		
		//add target+service to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(les);
		
		// get generated poxy object
		Bank bproxy = (Bank) pfb.getObject();
		int amount = bproxy.deposit("012NIBLs", 5000);
		System.out.println(amount);
	}

}
