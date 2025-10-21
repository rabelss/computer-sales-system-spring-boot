package com.yakup.sales.domain;

import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products") // ✅ doğru tablo adı
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String sku;

    @Column(precision = 18, scale = 2) // opsiyonel ama iyi pratik
    private BigDecimal price;

    @Column(name = "stock_quantity") // alan adını netleştirelim
    private Integer stockQuantity;   // ✅ küçük harf/camelCase

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}
