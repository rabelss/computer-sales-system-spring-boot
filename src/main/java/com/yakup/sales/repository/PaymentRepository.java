package com.yakup.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yakup.sales.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> , JpaSpecificationExecutor<Payment> {

}
