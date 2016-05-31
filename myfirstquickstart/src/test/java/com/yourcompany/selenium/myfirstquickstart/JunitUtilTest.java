package com.yourcompany.selenium.myfirstquickstart;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitUtilTest {

	JunitUtil junitUtil = new JunitUtil();
	
	@Test(expected = ArithmeticException.class)
	public void testDividendZero() {
		junitUtil.divide(1, 0);
	}
	
}
