package com.durgasoft.springioc_21_22;

public class StaticCar {
	
	private static String carName;
	
	public StaticCar() {
		System.out.println("StaticCar Object created.");
	}

	/**
	 * @param carName the carName to set
	 */
	public static void setCarName(String carName) {
		StaticCar.carName = carName;
	}
	
	public static void showDetails() {
		System.out.println("Car Name : "+carName);
	}
	
}
