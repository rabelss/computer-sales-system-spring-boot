package com.yakup.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yakup.sales.domain.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier,Long> , JpaSpecificationExecutor<Supplier> {

}
