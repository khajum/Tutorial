package com.durgasoft.springioc_21_22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		System.out.println("Car object created.");
	}
	
	@Autowired
	private Engine engine;
	
	public void showDetails() {
		System.out.println("Car Engine Model Year:"+engine.getModelYear());
	}

}
