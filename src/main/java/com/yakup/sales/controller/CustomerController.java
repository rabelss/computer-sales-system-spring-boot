package com.yakup.sales.controller;

import com.yakup.sales.domain.Customer;
import com.yakup.sales.dto.RequestDto;
import com.yakup.sales.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @PostMapping("/filter")
    public List<Customer> filter(@RequestBody RequestDto request) {
        return service.findByFilters(request);
    }

    @PostMapping("/filter-page")
    public Page<Customer> filterPage(@RequestBody RequestDto request, Pageable pageable) {
        var spec = service.getFiltersSpecification().getSearchSpecification(request);
        return service.getRepository().findAll(spec, pageable);
    }
}
