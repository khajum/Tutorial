package com.ram.factorypattern;

public class JavaUtilLogger implements Logger {

	@Override
	public void log() {
		System.out.println("Inside JavaUtilLogger::getLogger() method.");
	}

}
