package com.yakup.sales.controller;

import com.yakup.sales.domain.OrderItem;
import com.yakup.sales.dto.RequestDto;
import com.yakup.sales.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/order-items")
@RequiredArgsConstructor
public class OrderItemController {
    private final OrderItemService service;

    @PostMapping("/filter")
    public List<OrderItem> filter(@RequestBody RequestDto request) {
        return service.findByFilters(request);
    }

    @PostMapping("/filter-page")
    public Page<OrderItem> filterPage(@RequestBody RequestDto request, Pageable pageable) {
        var spec = service.getFiltersSpecification().getSearchSpecification(request);
        return service.getRepository().findAll(spec, pageable);
    }
}
