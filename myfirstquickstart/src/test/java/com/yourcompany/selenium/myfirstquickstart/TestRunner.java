package com.yourcompany.selenium.myfirstquickstart;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MessageUtilTest.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		
		}
		System.out.println(result.wasSuccessful());
	}
}
