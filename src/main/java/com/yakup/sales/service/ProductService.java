package com.yakup.sales.service;

import com.yakup.sales.domain.Product;
import com.yakup.sales.repository.ProductRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService implements IBaseFilterService<Product, ProductRepository> {

    private final ProductRepository repo;
    private final FiltersSpecification<Product> filters;

    @Override public ProductRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Product> getFiltersSpecification() { return filters; }
}
