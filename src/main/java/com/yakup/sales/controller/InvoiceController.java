package com.yakup.sales.controller;

import com.yakup.sales.domain.Invoice;
import com.yakup.sales.dto.RequestDto;
import com.yakup.sales.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/invoices")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService service;

    @PostMapping("/filter")
    public List<Invoice> filter(@RequestBody RequestDto request) {
        return service.findByFilters(request);
    }

    @PostMapping("/filter-page")
    public Page<Invoice> filterPage(@RequestBody RequestDto request, Pageable pageable) {
        var spec = service.getFiltersSpecification().getSearchSpecification(request);
        return service.getRepository().findAll(spec, pageable);
    }
}
