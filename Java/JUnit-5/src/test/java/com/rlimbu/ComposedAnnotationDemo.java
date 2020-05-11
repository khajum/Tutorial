package com.rlimbu;

import org.junit.jupiter.api.Test;

public class ComposedAnnotationDemo {

	@Test
	@Fast
	void myFastTest() {
		System.out.println("Meta-annotations and Composed Annotation example");
	}
}
