package com.yakup.sales.service;

import com.yakup.sales.domain.Category;
import com.yakup.sales.repository.CategoryRepository;
import com.yakup.sales.specification.FiltersSpecification;
import com.yakup.sales.specification.IBaseFilterService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService implements IBaseFilterService<Category, CategoryRepository> {

    private final CategoryRepository repo;
    private final FiltersSpecification<Category> filters;

    @Override public CategoryRepository getRepository() { return repo; }
    @Override public FiltersSpecification<Category> getFiltersSpecification() { return filters; }
}
