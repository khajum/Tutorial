package com.durgasoft.springioc_24;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean {

	private String carName;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
		
	@Override
	public Object getObject() throws Exception {
		Car car = (Car) Class.forName(carName).newInstance();
		return car;
	}

	@Override
	public Class getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
