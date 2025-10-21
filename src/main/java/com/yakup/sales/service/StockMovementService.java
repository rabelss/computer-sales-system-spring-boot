package com.yakup.sales.service;

import com.yakup.sales.domain.StockMovement;
import com.yakup.sales.repository.StockMovementRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockMovementService implements IBaseFilterService<StockMovement, StockMovementRepository> {

    private final StockMovementRepository repo;
    private final FiltersSpecification<StockMovement> filters;

    @Override public StockMovementRepository getRepository() { return repo; }
    @Override public FiltersSpecification<StockMovement> getFiltersSpecification() { return filters; }
}
