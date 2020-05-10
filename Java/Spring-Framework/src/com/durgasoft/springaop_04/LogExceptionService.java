/**
 * 
 */
package com.durgasoft.springaop_04;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

/**
 * @author i80779
 *
 */
public class LogExceptionService implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		Log log = LogFactory.getLog(Bank.class);
		log.info("incase of exception in deposit:");
		
	}
}
