package com.yakup.sales.service;

import com.yakup.sales.domain.Order;
import com.yakup.sales.repository.OrderRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService implements IBaseFilterService<Order, OrderRepository> {

    private final OrderRepository repo;
    private final FiltersSpecification<Order> filters;

    @Override public OrderRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Order> getFiltersSpecification() { return filters; }
}
