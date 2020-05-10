package com.javabrains.springaop25;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspectXML {
	
	
	private static Logger logger = null;
	
	public void beforeAdvice(JoinPoint joinPoint) {
		logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("Beginng method " + joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		
		for(Object arg : args) {
			logger.debug("Argument value is :"+arg);
		}

	}
	
	public void aroundAdvice(ProceedingJoinPoint pjp) {
		logger = LoggerFactory.getLogger(pjp.getTarget().getClass());
		
		try {
			logger.info("Beginning method "+pjp.getSignature().getName());
			pjp.proceed();
			logger.info("Ending method "+pjp.getSignature().getName());
		} catch (Throwable e) {
			logger.info(" After Throwing.");
		}
	
	}
	

}
