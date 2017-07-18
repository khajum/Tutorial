package com.ram.factorypattern;

public class CommonLogging implements Logger {

	@Override
	public void log() {
		System.out.println("Inside CommonLogging::getLogger() method.");
	}

}
