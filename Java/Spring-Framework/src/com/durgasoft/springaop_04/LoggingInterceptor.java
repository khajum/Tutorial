/**
 * 
 */
package com.durgasoft.springaop_04;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 * @author i80779
 *
 */
public class LoggingInterceptor implements MethodBeforeAdvice,
		AfterReturningAdvice, ThrowsAdvice {

	private static Log log = null;
	
	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		log = LogFactory.getLog(arg0.getClass());
		log.info("Ending method :" + arg1.getName());
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		log = LogFactory.getLog(arg0.getClass());
		log.info("Beginning method :" + arg0.getName());
			
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		
		log = LogFactory.getLog(args.getClass());
		log.info("Exception in method " + method.getName()+" Exception is :" +ex.getMessage());
				
	}

}
