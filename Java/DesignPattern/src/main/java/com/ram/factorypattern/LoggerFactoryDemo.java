package com.ram.factorypattern;

public class LoggerFactoryDemo {

	public static void main(String[] args) {
		Logger logger = new LoggerFactory().getLogger("log4j");
		logger.log();

	}

}
