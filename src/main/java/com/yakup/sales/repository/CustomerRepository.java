package com.yakup.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yakup.sales.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> , JpaSpecificationExecutor<Customer> {

}
