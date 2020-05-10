package com.durgasoft.annotation.springioc_19;

public class Engine {
	
	private String modelYear;

	public Engine() {
		System.out.println("Engine object created.");
	}
	/**
	 * @return the modelYear
	 */
	public String getModelYear() {
		return modelYear;
	}

	/**
	 * @param modelYear the modelYear to set
	 */
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
	

}
