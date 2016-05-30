package com.yourcompany.selenium.myfirstquickstart;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MessageUtilTest {
	
	String message = "Hello World";
	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
}
