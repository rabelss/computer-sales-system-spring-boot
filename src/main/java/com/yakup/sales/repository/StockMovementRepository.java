package com.yakup.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yakup.sales.domain.StockMovement;

public interface StockMovementRepository extends JpaRepository<StockMovement,Long> , JpaSpecificationExecutor<StockMovement>{

}
