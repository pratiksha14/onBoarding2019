package com.amdocs;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestClass2 {
	
	@Category(SmokeTest.class)
	
	@Test
	public void testCase1() {
		System.out.println("Test Class 2 - Test Case 1");
	}
	
	@Test
	public void testCase() {
		System.out.println("Test Class 2 - Test Case 2");
	}
}
