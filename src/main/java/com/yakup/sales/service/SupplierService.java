package com.yakup.sales.service;

import com.yakup.sales.domain.Supplier;
import com.yakup.sales.repository.SupplierRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService implements IBaseFilterService<Supplier, SupplierRepository> {

    private final SupplierRepository repo;
    private final FiltersSpecification<Supplier> filters;

    @Override public SupplierRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Supplier> getFiltersSpecification() { return filters; }
}
