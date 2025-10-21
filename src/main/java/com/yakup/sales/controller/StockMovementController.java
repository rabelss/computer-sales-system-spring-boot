package com.yakup.sales.controller;

import com.yakup.sales.domain.StockMovement;
import com.yakup.sales.dto.RequestDto;
import com.yakup.sales.service.StockMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stock-movements")
@RequiredArgsConstructor
public class StockMovementController {
    private final StockMovementService service;

    @PostMapping("/filter")
    public List<StockMovement> filter(@RequestBody RequestDto request) {
        return service.findByFilters(request);
    }

    @PostMapping("/filter-page")
    public Page<StockMovement> filterPage(@RequestBody RequestDto request, Pageable pageable) {
        var spec = service.getFiltersSpecification().getSearchSpecification(request);
        return service.getRepository().findAll(spec, pageable);
    }
}
