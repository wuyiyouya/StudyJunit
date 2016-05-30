package com.yourcompany.selenium.myfirstquickstart;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class TestJunit2 extends TestCase {
	protected double fValue1;
	protected double fValue2;
		
	@Before
	public void setUp() {
		fValue1 = 2.0;
		fValue2 = 3.0;
	}
	
	@Test
	public void testAdd() {
		//count the number of test cases
//		System.out.println("Number of test cases = " + this.countTestCases());
		
		//test getName
//		String name = this.getName();
//		System.out.println("Test case name is " + name);
		
		//test setName
//		this.setName("testNewAdd");
//		String newName = this.getName();
//		System.out.println("Updated test case name is " + newName);
	}
	
	//tearDown
	public void tearDown() {
		this.tearDown();
	}
}

