package com.ram.factorypattern;

public class LogBackLogger implements Logger {

	@Override
	public void log() {
		System.out.println("Inside LogBackLogger::getLogger() method.");
	}

}
