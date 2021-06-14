package com.bms.account.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.account.entity.Customer;
import com.bms.account.repo.CustomerRepository;
import com.bms.account.service.CustomerRegistrationService;

import reactor.core.publisher.Mono;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRegistrationServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Mono<Customer> registerCustomer(Customer customer) {
		return customerRepository.save(customer)
				.doOnSuccess(cus -> LOGGER.info("Customer registered: accountno={}", cus.getAccountno()));
	}

	@Override
	public Mono<Customer> viewCustomer(Customer customer) {
		LOGGER.info("viewCustomer: username={}", customer.getAccountno());
		return customerRepository.findById(customer.getAccountno());
	}

}
