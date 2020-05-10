package com.durgasoft.springioc_16;

public class Engine {
	
	private String modelYear;

	public Engine() {
		System.out.println("Engine object created.");
	}
	public Engine(String modelYear) {
		this.modelYear = modelYear;
	}
	/**
	 * @param modelYear the modelYear to set
	 */
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
	/**
	 * 
	 * @return modelYear
	 */
	public String getModelYear() {
		return modelYear;
	}

}
