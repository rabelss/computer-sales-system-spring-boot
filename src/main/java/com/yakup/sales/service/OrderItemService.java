package com.yakup.sales.service;

import com.yakup.sales.domain.OrderItem;
import com.yakup.sales.repository.OrderItemRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderItemService implements IBaseFilterService<OrderItem, OrderItemRepository> {

    private final OrderItemRepository repo;
    private final FiltersSpecification<OrderItem> filters;

    @Override public OrderItemRepository getRepository() { return repo; }
    @Override public FiltersSpecification<OrderItem> getFiltersSpecification() { return filters; }
}
