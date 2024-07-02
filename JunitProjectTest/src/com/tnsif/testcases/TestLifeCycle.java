package com.tnsif.testcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {
	
	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before Each Test."); //Print 2nd //Print 5th
	}
	
	@AfterEach
	void afterEachTest() {
		System.out.println("After Each Test."); //Print 4th //Print 7th
	}
	
	@BeforeAll
	void beforeAllTests() {
		System.out.println("Before All Tests."); //Print 1st
	}
	
	@AfterAll
	void afterAllTests() {
		System.out.println("After All Tests."); //Print 8th
	}
	
	@Test
	void testMethod1() {
		System.out.println("Test Method 1...."); //Print 3rd
	}
	@Test
	void testMethod2() {
		System.out.println("Test Method 2...."); //Print 6th
	}
}
