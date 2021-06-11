package com.bms.account.controller;

import java.net.URISyntaxException;

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
	
	@Autowired
	private CustomerRegistrationService customerRegistrationService;
	
	@Autowired
	PasswordEncoder encoder;	
	
	@PostMapping("/customer/register")
	public Mono<Customer> registerCustomer(@RequestBody Customer customer)
			throws URISyntaxException {
		customer.setPassword(encoder.encode(customer.getPassword()));
		return customerRegistrationService.registerCustomer(customer);
	}
	
	@GetMapping("/customer/view")
	public Mono<Customer> viewCustomerDetails(@RequestBody Customer customer)
			throws URISyntaxException {
		customer.setPassword(encoder.encode(customer.getPassword()));
		return customerRegistrationService.viewCustomer(customer);
	}
	
	
//	@PostMapping("/loan/apply")
//	public Mono<Loan> applyLoan(@RequestBody Loan loan)
//			throws URISyntaxException {
//		return customerRegistrationService.applyLoan(loan);
//	}
}
