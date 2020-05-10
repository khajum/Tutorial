package com.durgasoft.springaop_05;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method arg0, Class arg1) {

		if (arg0.getName().equals("deposit")) {
			return true;
		} else {
			return false;
		}

	}

}
