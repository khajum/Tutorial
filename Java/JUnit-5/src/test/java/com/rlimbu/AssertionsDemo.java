package com.rlimbu;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertionsDemo {

	private Calculator calculator = new Calculator();
	private Person person = new Person("Ram", "Limbu");
	
	@Test
	void standardAssertions() {
		assertEquals(10, calculator.add(4, 6));
		assertEquals(24, calculator.multiply(4,6),"This optional failure messae is the last parameter");
		assertTrue('a'<'b');
	}
	
	@Test
	void groupedAssertions() {
		assertAll(
				() -> assertEquals("Ram", person.getFirstName()),
				() -> assertEquals("Limbu", person.getLastName())
		);
	}
	
	@Test
	void exceptionTesting() {
		Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));
		assertEquals("/ by zero", exception.getMessage());
		
	}
}
