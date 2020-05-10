package com.durgasoft.springioc_24;

public class CarInstanceFactory {
	
	private static CarInstanceFactory cf;
	
	public CarInstanceFactory() {
		System.out.println("CarInstanceFactory object created.");
	}
	
	public static CarInstanceFactory getInstance() {
		
		if (cf == null) {
			cf = new CarInstanceFactory();
			return cf;
		} else {
			return cf;
		}
		
	}

}
