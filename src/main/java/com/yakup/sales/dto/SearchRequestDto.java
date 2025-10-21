package com.yakup.sales.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class SearchRequestDto {
    private String column;
    private Object value;
    private Operation operation;

    public enum Operation {
        EQUAL,
        LIKE,
        GREATER_THAN,
        LESS_THAN
    }
}

