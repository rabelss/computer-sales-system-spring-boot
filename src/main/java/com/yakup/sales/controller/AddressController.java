package com.yakup.sales.controller;

import com.yakup.sales.domain.Address;
import com.yakup.sales.dto.RequestDto;
import com.yakup.sales.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService service;

    @PostMapping("/filter")
    public List<Address> filter(@RequestBody RequestDto request) {
        return service.findByFilters(request);
    }

    @PostMapping("/filter-page")
    public Page<Address> filterPage(@RequestBody RequestDto request, Pageable pageable) {
        var spec = service.getFiltersSpecification().getSearchSpecification(request);
        return service.getRepository().findAll(spec, pageable);
    }
}
