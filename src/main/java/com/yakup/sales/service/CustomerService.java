package com.yakup.sales.service;

import com.yakup.sales.domain.Customer;
import com.yakup.sales.repository.CustomerRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService implements IBaseFilterService<Customer, CustomerRepository> {

    private final CustomerRepository repo;
    private final FiltersSpecification<Customer> filters;

    @Override public CustomerRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Customer> getFiltersSpecification() { return filters; }
}
