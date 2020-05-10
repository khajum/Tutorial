/**
 * 
 */
package com.durgasoft.springioc_16;

/**
 * @author i80779
 *
 */
public class Car {
	
	private String carName;
	private Engine engine;
	
	public Car() {
		System.out.println("Car object created.");
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData() {
		System.out.println("Car Name : "+carName);
		System.out.println("Engine Model Year : "+engine.getModelYear());
	}

}
