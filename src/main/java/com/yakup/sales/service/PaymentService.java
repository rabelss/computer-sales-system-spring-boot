package com.yakup.sales.service;

import com.yakup.sales.domain.Payment;
import com.yakup.sales.repository.PaymentRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService implements IBaseFilterService<Payment, PaymentRepository> {

    private final PaymentRepository repo;
    private final FiltersSpecification<Payment> filters;

    @Override public PaymentRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Payment> getFiltersSpecification() { return filters; }
}
