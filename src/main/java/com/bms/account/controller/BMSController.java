package com.bms.account.controller;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.account.entity.Customer;
import com.bms.account.service.CustomerRegistrationService;

import reactor.core.publisher.Mono;

@RestController()
@RequestMapping("/bms")
public class BMSController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BMSController.class);
	
	@Autowired
	private CustomerRegistrationService customerRegistrationService;
	
	@Autowired
	PasswordEncoder encoder;	
	
	@PostMapping("/customer/register")
	public Mono<Customer> registerCustomer(@RequestBody Customer customer)
			throws URISyntaxException {
		LOGGER.info("New Customer Registration!!");
		customer.setPassword(encoder.encode(customer.getPassword()));
		return customerRegistrationService.registerCustomer(customer);
	}
	
	@GetMapping("/customer/view")
	public Mono<Customer> viewCustomerDetails(@RequestBody Customer customer)
			throws URISyntaxException {
		LOGGER.info("View Customer Details!!");
		customer.setPassword(encoder.encode(customer.getPassword()));
		return customerRegistrationService.viewCustomer(customer);
	}
	
}
