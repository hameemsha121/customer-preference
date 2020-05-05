package com.cts.superstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.superstore.entity.CustomerEntity;

public interface GetCustomerByIdRepository extends JpaRepository<CustomerEntity,Integer>{

}
