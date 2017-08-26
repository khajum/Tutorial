package com.in28minutes.login;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	private static Logger logger = LoggerFactory
			.getLogger(ExceptionController.class);

	@ExceptionHandler(value = Exception.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		logger.error("Request " + request.getRequestURL()
				+ " threw an exception " + ex);

		return "error";

	}

}
