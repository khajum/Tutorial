package com.durgasoft.springaop_03;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Client {

	public static void main(String[] args) {
		// create target
		Bank b = new Bank();
		
		// Create service
		LogAroundService las = new LogAroundService();
		
		//add target+service to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(las);
		
		// get generated poxy object
		Bank bproxy = (Bank) pfb.getObject();
		int amount = bproxy.deposit("012NIBL", 5000);
		System.out.println(amount);

	}

}
