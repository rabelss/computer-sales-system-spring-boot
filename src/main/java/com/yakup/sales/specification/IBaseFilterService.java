package com.yakup.sales.specification;


import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yakup.sales.dto.RequestDto;

/**
 * T -> Entity tipi
 * R -> Repository tipi (JpaSpecificationExecutor<T> genişletmeli)
 */
public interface IBaseFilterService<T, R extends JpaSpecificationExecutor<T>> {

    /** Servisin kullanacağı repository */
    R getRepository();

    /** Dinamik filtre üreticisi (Specification) */
    FiltersSpecification<T> getFiltersSpecification();

    /** RequestDto -> Specification -> Sonuç listesi */
    default List<T> findByFilters(RequestDto requestDto) {
        Specification<T> spec = getFiltersSpecification().getSearchSpecification(requestDto);
        return getRepository().findAll(spec);
    }

    // İstersen paging'li sürümü de ekleyebilirsin:
    // default Page<T> findByFilters(RequestDto requestDto, Pageable pageable) {
    //     Specification<T> spec = getFiltersSpecification().getSearchSpecification(requestDto);
    //     return getRepository().findAll(spec, pageable);
    // }
}
