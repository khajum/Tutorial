package io.javabrains.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class CourseApiApp {

	public static void main(String[] args) {
		// SpringApplication.run(CourseApiApp.class, args);

		SpringApplication app = new SpringApplication(CourseApiApp.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
