package com.bms.account.service;

import com.bms.account.entity.Customer;

import reactor.core.publisher.Mono;

public interface CustomerRegistrationService {
	
	Mono<Customer> registerCustomer(Customer customer);

	Mono<Customer> viewCustomer(Customer customer);
	
}
