package com.yakup.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.yakup.sales.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>,JpaSpecificationExecutor<Address>   {

}
