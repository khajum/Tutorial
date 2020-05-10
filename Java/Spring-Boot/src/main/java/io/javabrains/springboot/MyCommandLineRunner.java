package io.javabrains.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out
				.println("Welcome "
						+ arg0.toString()
						+ " to this application. Messge generated from CommandLineRunner");

	}

}
