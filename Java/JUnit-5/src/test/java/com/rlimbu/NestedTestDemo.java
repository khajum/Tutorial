package com.rlimbu;

import java.util.Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A Stack")
public class NestedTestDemo {

	Stack<Object> stack;
	
	@Test
	@DisplayName("is initiated with new stack.")
	void init() {
		new Stack<>();
	}
	
}
