package com.yakup.sales.service;

import com.yakup.sales.domain.Invoice;
import com.yakup.sales.repository.InvoiceRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceService implements IBaseFilterService<Invoice, InvoiceRepository> {

    private final InvoiceRepository repo;
    private final FiltersSpecification<Invoice> filters;

    @Override public InvoiceRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Invoice> getFiltersSpecification() { return filters; }
}
