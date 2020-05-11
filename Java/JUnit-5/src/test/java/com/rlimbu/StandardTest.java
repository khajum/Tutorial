package com.rlimbu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StandardTest {

	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll test");
	}
	
	@BeforeEach
	void init() {
		System.out.println("BeforeEach test.");
	}
	
	@Test
	void succeedingTest() {
		assertEquals(1, 1);
	}
	
	@Test
	void failingTest() {
		fail("a failing test");
	}
	
	@Test
	@Disabled("for demo purpose")
	void skippedTest() {
		//not executed
	}
	
	@Test
	void abortedTest() {
		assumeTrue("rlimbu".contains("A"));
		fail("Test should have been aborted.");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("AfterEarch example.");
	}
	
	@AfterAll
	static void tearDownAll() {
		System.out.println("AfterAll example");
	}
}
