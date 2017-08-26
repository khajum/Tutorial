package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
	
	private static Logger logger = null;
	
	@Before(value="allControllerMethods()")
	public void logBefore(JoinPoint joinPoint) {
		
		logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("Beginning method: "+joinPoint.getSignature().getName());
		
	}
	
	@Pointcut("within(*..*Controller)")
	public void allControllerMethods(){}

}
