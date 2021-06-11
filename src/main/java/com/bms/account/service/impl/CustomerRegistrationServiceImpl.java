package com.bms.account.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.account.entity.Customer;
import com.bms.account.entity.Loan;
import com.bms.account.repo.CustomerRepository;
import com.bms.account.repo.LoanRepository;
import com.bms.account.service.CustomerRegistrationService;

import reactor.core.publisher.Mono;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private LoanRepository loanRepository;

	@Override
	public Mono<Customer> registerCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Mono<Customer> viewCustomer(Customer customer) {
		return customerRepository.findByUsernameAndPassword(customer.getUsername(), customer.getPassword());
	}

	@Override
	public Mono<Loan> applyLoan(Loan loan) {
		Mono<Customer> customer = customerRepository.findById(loan.getAccountno());
		return customer.flatMap(customerDetails -> {
			 loan.setDate(new Date(System.currentTimeMillis()));
			return loanRepository.save(loan);
		});
	}

}
