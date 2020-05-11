package com.rlimbu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayNameDemo {

	@Test
	@DisplayName("Custom test name")
	void testDisplayName() {
		
	}
	
	
	@Test
	@DisplayName(value = "╯°□°）")
	void testDisplayNameContainingSpecialChars() {
		
	}
	
	@Test
	@DisplayName("😱")
	void testDisplayNameContainingEmoji() {
		
	}
}
