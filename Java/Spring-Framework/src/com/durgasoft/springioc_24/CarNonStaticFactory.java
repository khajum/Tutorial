package com.durgasoft.springioc_24;

public class CarNonStaticFactory {
	
	private String carName;

	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public Car getCar() throws Exception {
		Car car = (Car) Class.forName(carName).newInstance();
		return car;
		
	}

}
