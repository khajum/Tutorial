package com.in28minutes.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping("/hellorest")
	public String hello() {
		return "Hello from Rest API";
	}

}
