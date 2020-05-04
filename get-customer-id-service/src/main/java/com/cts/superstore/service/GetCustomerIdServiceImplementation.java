package com.cts.superstore.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.superstore.entity.CustomerEntity;
import com.cts.superstore.model.Customer;
import com.cts.superstore.repository.GetCustomerIdRepository;

@Service
public class GetCustomerIdServiceImplementation implements GetCustomerIdService {

	@Autowired
	GetCustomerIdRepository customerRepo;
	
	
	public Customer getCustomerById(int id) {
		
		Optional<CustomerEntity> cust = customerRepo.findById(id);
		Customer customer=new Customer();
		BeanUtils.copyProperties(cust.orElse(null),customer );
		return customer;
	}
	
}
