package com.bms.account.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bms.account.entity.Loan;

public interface LoanRepository extends ReactiveCrudRepository<Loan, Integer>{

}
