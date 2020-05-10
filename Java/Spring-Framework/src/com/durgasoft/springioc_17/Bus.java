package com.durgasoft.springioc_17;

public class Bus {
	
	private Engine engine;
	
	public Bus() {
		System.out.println("Bus object created");
	}

/**
 * 
 * @param engine
 */
	public Bus(Engine engine) {
		System.out.println("Parameter Bus constructor.");
		this.engine = engine;
	}
	
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		System.out.println("Bus Setter method.");
		this.engine = engine;
	}
	
	public void showDetails() {
		System.out.println("Bus Engine Model Year: "+engine.getModelYear());
	}
	

}
