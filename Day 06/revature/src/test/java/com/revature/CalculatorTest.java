package com.revature;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import revature.Calculator;

public class CalculatorTest {
	static Calculator c = null;
	
	int input1 = 0;
	int input2 = 0;
	int result = 0;

	
	@Test
	public void TestSum() {
		
		result = c.sum(input2, input1);
		Assertions.assertEquals(30, result);
		
	}
	
	@Test
	public void TestSum2() {
		
		result = c.sum(input2, input1);
		Assertions.assertNotEquals(300, result);
		
	}
	
	@BeforeEach
	public void beforeEach() {
		input1 = 10;
		input2 = 20;
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("AfterEach Executed");
	}
	
	@BeforeAll
	public static void beforeAll() {
		c = new Calculator();
	}
	
	@AfterAll
	public static void afterAll() {
		c = null;
	}
	
}
