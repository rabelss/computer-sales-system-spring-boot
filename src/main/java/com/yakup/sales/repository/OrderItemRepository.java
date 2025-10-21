package com.yakup.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yakup.sales.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> , JpaSpecificationExecutor<OrderItem>{

}
