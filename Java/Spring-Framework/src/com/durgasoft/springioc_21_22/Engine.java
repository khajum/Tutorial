package com.durgasoft.springioc_21_22;

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
