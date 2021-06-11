package com.bms.account.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bms.account.entity.Customer;

import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer>{
	
	Mono<Customer> findByUsernameAndPassword(String username, String password);

}
