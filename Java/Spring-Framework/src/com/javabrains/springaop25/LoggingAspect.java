package com.javabrains.springaop25;

import javax.sql.rowset.JoinRowSet;







//import org.apache.log4j.spi.LoggerFactory;
//import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
	private static Logger logger = null;
	private static Logger log4jLogger = null;
	
/*	@Before(value = "execution(* get*())")
	public void LoggingAdvice() {
		System.out.println("Advice run. Get Method called.");
	}
	
	@Before("execution(* get*())")
	public void secondAdvice() {
		System.out.println("Second advice executed.");
	}
	
	
	// implemented using @Pointcut expression
	
	@Before("allGetters()")
	public void thirdAdvice() {
		System.out.println("Third Advice executed using Pointcut annotation.");
	}
*/
	
	
	@Before("allCircleMethods()")
	public void fourthdAdvice(JoinPoint joinPoint) {
		logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("Fourth Advice executed using Pointcut annotation.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	@Pointcut("within(*..*Service)") //all method inside Circle class
	public void allCircleMethods(){}
	
	//combining pointcut expression
	@Pointcut(" allGetters() && allCircleMethods()")
	public void circleGetMothods(){}
	
	
	/* Tutorial - 30 JoinPoints and Advice Arguments */
/*	
	@Pointcut("execution( * com.javabrains.springaop25.Triangle.get*(..))")
	public void triangleGetMethods(){}
	
	@Before("triangleGetMethods()")
	public void advice30(JoinPoint joinPoint) {
		
		 Logging using SLF4J 
		logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("Method "+joinPoint.getSignature().getName()+" called using advice30 method.");
		
		Logging using log4j logging API
		log4jLogger = (Logger) org.apache.log4j.Logger.getLogger(joinPoint.getTarget().getClass());
		log4jLogger.info("Method "+joinPoint.getSignature().getName()+" called.");
	}
	
	@Before("args(String)")
	public void stringArgumentMethods(JoinPoint joinPoint) {
		logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("Method "+joinPoint.getSignature().getName()+" called using advice stringArgumentMethods ");
		
	}
	*/
	
	
	/* Tutorial - 31 After Advice Types */
	/*
	@After("execution(* runtime*(..))")
	public void afterAdvice(JoinPoint jp) {
		logger = LoggerFactory.getLogger(jp.getTarget().getClass());
		logger.info("Method "+jp.getSignature().getName()+" called using advice afterAdvice ");
		
	}
	
	@AfterReturning(pointcut="execution(* get*(..))",returning="returnString")
	public void afterReturningAdvice(JoinPoint jp, String returnString) {
		logger = LoggerFactory.getLogger(jp.getTarget().getClass());
		logger.info("Method "+jp.getSignature().getName()+" called using advice afterReturningAdvice method. The Return value is: "+returnString);		
	}
	
	@AfterThrowing("execution(* runtime*(..))")
	public void exceptionAdvice(JoinPoint jp) {
		logger = LoggerFactory.getLogger(jp.getTarget().getClass());
		logger.info("Method "+jp.getSignature().getName()+" called using advice exceptionAdvice.");		
	}
	*/
	
	
	/* Tutorial 32 - Around Advice Type */	
/*	@Around(value="allGetters()")
	public void aroundAdvice(ProceedingJoinPoint pjp) {
		try {
			
			logger = LoggerFactory.getLogger(pjp.getTarget().getClass());
			logger.info("Beginning of "+pjp.getSignature().getName()+" using advice aroundAdvice.");			
			pjp.proceed();
			logger.info("End of "+pjp.getSignature().getName()+" using advice aroundAdvice.");
		} catch (Throwable e) {
			logger.info("After Throwing.");
		}
		
	}
	
	@Pointcut("execution( * get*())")
	public void allGetters(){}
	*/
	
	/* Tutorial 33 - Custom Advice Annotation */	
	
/*	@Before("@annotation(com.javabrains.springaop25.Loggable)")
	public void beforeAdivce(JoinPoint joinPoint) {
		logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("Beginning of "+joinPoint.getSignature().getName());
		
	}
	*/
}
