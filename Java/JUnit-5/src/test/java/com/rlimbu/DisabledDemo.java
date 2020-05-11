package com.rlimbu;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled("Disabled until bug #99 has been fixed.")
public class DisabledDemo {
	
	@Disabled("Disabled until bug #88 has been resolved.")
	@Test
	void testWillBeSkipped() {
		fail("faield test.");
	}
	
	@Test
	void testWillBeExecuted() {
		System.out.println("executed.");
	}
	
}
