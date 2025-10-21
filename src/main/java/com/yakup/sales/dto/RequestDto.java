package com.yakup.sales.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RequestDto {
    private List<SearchRequestDto> searchRequestDto; // Birden fazla filtre koşulu

    private GlobalOperator globalOperator = GlobalOperator.AND;

    public enum GlobalOperator{
        AND,
        OR
    }
}
