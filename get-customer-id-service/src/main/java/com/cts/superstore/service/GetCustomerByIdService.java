package com.cts.superstore.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.superstore.entity.CustomerEntity;
import com.cts.superstore.model.Customer;
import com.cts.superstore.repository.GetCustomerByIdRepository;

@Service
public class GetCustomerByIdService  { // implements GetCustomerIdService {

	@Autowired
	GetCustomerByIdRepository getCustomerByIdRepo;
	
	
	public Customer getCustomerById(int id) {
		
		Optional<CustomerEntity> customerEntity = getCustomerByIdRepo.findById(id);
		Customer customer=new Customer();
		BeanUtils.copyProperties(customerEntity.get(),customer );
		return customer;
	}
	
}
