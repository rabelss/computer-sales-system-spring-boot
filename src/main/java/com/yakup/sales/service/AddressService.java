package com.yakup.sales.service;

import com.yakup.sales.domain.Address;
import com.yakup.sales.repository.AddressRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService implements IBaseFilterService<Address, AddressRepository> {

    private final AddressRepository repo;
    private final FiltersSpecification<Address> filters;

    @Override public AddressRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Address> getFiltersSpecification() { return filters; }
}
