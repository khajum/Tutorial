package com.durgasoft.annotation.springioc_19;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {
	
	//@Qualifier("engine")
	//@Autowired // In spring 2.5 and older, it is not supported.
	@Resource // IOC part-34, J2EE annotation for DI
	private Engine engine;
	
	public Bus() {
		System.out.println("Bus object created.");
	}
	
	public void showDetails() {
		System.out.println("Bus's Engine Model Year : "+engine.getModelYear());
	}

}
