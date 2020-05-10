package com.javabrains.springaop25;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspectAnnotation {
	
	private static Logger logger = null;
	
	//@Before(value = "allSettors()")
	public void BeforeAdvice(JoinPoint joinPoint) {
		logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("Beginng method " + joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		
		for(Object arg : args) {
			logger.debug("Argument value is :"+arg);
		}

	}
	
	@Pointcut(value="execution(* set*(..))")
	public void allSettors(){} 
	

	@Around(value="allSettors()")
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
