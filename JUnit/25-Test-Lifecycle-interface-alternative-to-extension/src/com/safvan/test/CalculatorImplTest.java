package com.safvan.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.safvan.service.Calculator;

class CalculatorImplTest implements CalculatorTest {
	private Calculator cobj = new Calculator();

	@Test
	void additionTest() {
		assertEquals(2, cobj.addition(1, 1));
	}

	@Test
	void multiplicationTest() {
		assertEquals(1, cobj.multiplication(1, 1));
	}

}
