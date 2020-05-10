/**
 * 
 */
package com.durgasoft.springaop_05;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author i80779
 *
 */
public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] param, Object obj)
			throws Throwable {
		Log log = (Log) LogFactory.getLog(obj.getClass());
		log.info("Beginning method:"+method.getName()+" of Class " +obj.getClass());
	}

}
