package com.durgasoft.springaop_03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogAroundService implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Log log = LogFactory.getLog(arg0.getClass());
		log.info("Before deposit code...");
		Object ret = arg0.proceed();
		log.info("After deposti code...");
		
		return ret;
	}

}
