package com.durgasoft.springioc_24;

public class CarFactory {
	
	private static String carName;

	/**
	 * @param carName the carName to set
	 */
	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	
	public static Car getCar() throws Exception {
		Car car = (Car) Class.forName(carName).newInstance();
		return car;
		
	}

}
