package com.bms.account.service;

import org.junit.jupiter.api.Test;
import com.bms.account.entity.Customer;
import com.bms.account.service.impl.CustomerRegistrationServiceImpl;
import reactor.test.StepVerifier;

public class BmsServiceTests {

	CustomerRegistrationServiceImpl customerreg;
	
	
	@Test
	public void testRegisterEmployees() {
		
		Customer customer = new Customer(5, "jaishree", "jaishree", "chennai", "TN", "India", "jai@gmail.com", "asdefr657a", "4445324532", "01/01/1975", "savings account");
		
		StepVerifier
		.create(customerreg.registerCustomer(customer))
		.expectNext(customer)
		.expectComplete()
		.verify();		
	}
	
	@Test
	public void testViewEmployees() {
		
		Customer customer = new Customer(8, "jai", "jai", "erode", "TN", "India", "jai@gmail.com", "fsaefr657a", "4445324532", "01/01/1975", "current account");
		
		StepVerifier
		.create(customerreg.registerCustomer(customer))
		.expectNext(customer)
		.expectComplete()
		.verify();	
		
		StepVerifier
		.create(customerreg.viewCustomer(customer))
		.expectNext(customer)
		.expectComplete()
		.verify();	
	}
	

}
