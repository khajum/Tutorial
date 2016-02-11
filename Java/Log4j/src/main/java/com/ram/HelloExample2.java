package com.ram;

import org.apache.log4j.Logger;

public class HelloExample2 {
	
	private static final Logger logger = Logger.getLogger(HelloExample2.class);

	public static void main(String[] args) {
		HelloExample2 he = new HelloExample2();
		try {
			System.out.println("Hello");
			he.divide();
		} catch (ArithmeticException e) {
			logger.error("Error :"+e);
		}
		
	}
	
	public void divide() {
		int i = 10/0;
	}

}
