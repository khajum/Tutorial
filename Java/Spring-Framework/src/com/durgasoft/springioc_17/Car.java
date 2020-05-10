package com.durgasoft.springioc_17;

public class Car {
	
	private Engine engine;
	
	public Car() {
		System.out.println("Car object created.");
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void showDetails() {
		System.out.println("Car's Engine Model: "+engine.getModelYear());
	}

}
