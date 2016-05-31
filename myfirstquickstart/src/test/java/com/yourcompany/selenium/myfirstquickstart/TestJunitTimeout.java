package com.yourcompany.selenium.myfirstquickstart;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TestJunitTimeout {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(timeout=500)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());		
	}
}
