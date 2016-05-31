package com.yourcompany.selenium.myfirstquickstart;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunitIgnore {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Ignore
	@Test
	public void testPrintMessage() {
		System.out.println("Incident testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Incident testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());		
	}
}
