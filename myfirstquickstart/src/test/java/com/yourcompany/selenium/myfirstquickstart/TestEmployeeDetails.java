package com.yourcompany.selenium.myfirstquickstart;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeDetails {
	
	EmployeeDetails employee = new EmployeeDetails();
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	
	@Test
	public void testCalculateAppraisal() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);	
	}
	
	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double yearlySalary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000, yearlySalary, 0.0);	
	}
}
