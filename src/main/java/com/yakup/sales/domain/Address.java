package com.yakup.sales.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "addresses")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private String city;
    private String district;
    private String street;
    private String postalCode;

    // Eğer iki yönlü ilişki istersen (opsiyonel):
    // @OneToOne(mappedBy = "address")
    // private Customer customer;
}
