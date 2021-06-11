package com.bms.account.service;

import com.bms.account.entity.Customer;
import com.bms.account.entity.Loan;

import reactor.core.publisher.Mono;

public interface CustomerRegistrationService {
	Mono<Customer> registerCustomer(Customer customer);

	Mono<Customer> viewCustomer(Customer customer);

	Mono<Loan> applyLoan(Loan loan);
}
