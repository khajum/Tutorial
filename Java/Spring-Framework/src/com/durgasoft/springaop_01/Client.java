package com.durgasoft.springaop_01;

import org.springframework.aop.framework.ProxyFactoryBean;

public class Client {

	public static void main(String[] args) {
		// create targeet
		Bank b = new Bank();
		
		// Create service
		LogBeforeService lbs = new LogBeforeService();
		
		//add target+service to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		// get generated poxy object
		Bank bproxy = (Bank) pfb.getObject();
		int amount = bproxy.deposit("012NIBL", 5000);
		System.out.println(amount);
	}

}
