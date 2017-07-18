/**
 * 
 */
package com.ram.factorypattern;

/**
 * @author i80779
 *
 */
public class Log4jLogger implements Logger {

	/* (non-Javadoc)
	 * @see com.ram.factorypattern.Logger#getLogger()
	 */
	@Override
	public void log() {
		System.out.println("Inside Log4jLogger::getLogger() method.");

	}

}
