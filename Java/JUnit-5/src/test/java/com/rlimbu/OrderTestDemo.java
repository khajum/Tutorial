package com.rlimbu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Order Test Demo")
@TestMethodOrder(OrderAnnotation.class)
public class OrderTestDemo {

	@Test
	@Order(1)
	void testNull() {
		System.out.println("Test NULL case.");
	}
	
	@Test
	@Order(2)
	void testBlank() {
		System.out.println("Test Blank case.");
	}
	
	@Test
	@Order(3)
	void testValidValues() {
		System.out.println("Test Valid Values.");
	}
}
