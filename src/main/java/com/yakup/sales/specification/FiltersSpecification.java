package com.yakup.sales.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.yakup.sales.dto.RequestDto;
import com.yakup.sales.dto.SearchRequestDto;

import jakarta.persistence.criteria.Predicate;

@Component
public class FiltersSpecification<T> {

    public Specification<T> getSearchSpecification(RequestDto requestDto) {

        return (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            for (SearchRequestDto searchDto : requestDto.getSearchRequestDto()) {

                switch (searchDto.getOperation()) {

                    case EQUAL:
                        predicates.add(criteriaBuilder.equal(
                                root.get(searchDto.getColumn()), searchDto.getValue()));
                        break;

                    case LIKE:
                        predicates.add(criteriaBuilder.like(
                                criteriaBuilder.lower(root.get(searchDto.getColumn())),
                                "%" + searchDto.getValue().toString().toLowerCase() + "%"));
                        break;

                    case GREATER_THAN:
                        predicates.add(criteriaBuilder.greaterThan(
                                root.get(searchDto.getColumn()),
                                searchDto.getValue().toString()));
                        break;

                    case LESS_THAN:
                        predicates.add(criteriaBuilder.lessThan(
                                root.get(searchDto.getColumn()),
                                searchDto.getValue().toString()));
                        break;
                }
            }

            // Eğer globalOperator OR ise, tüm koşulları OR ile bağla
            if (requestDto.getGlobalOperator() == RequestDto.GlobalOperator.OR) {
                return criteriaBuilder.or(predicates.toArray(new Predicate[0]));
            }
            // Değilse (varsayılan AND), tümünü AND ile bağla
            else {
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        };
    }
}
