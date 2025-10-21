package com.yakup.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yakup.sales.domain.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> , JpaSpecificationExecutor<Invoice> {

}
