package com.yourcompany.selenium.myfirstquickstart;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {
	public static void main(String[] args) {
		TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = " + result.runCount());
	}
}
