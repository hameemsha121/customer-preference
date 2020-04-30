package com.cts.superstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.superstore.model.GetCustomerId;
import com.cts.superstore.repository.GetCustomerIdRepository;

@Service
public class GetCustomerIdServiceImplementation implements GetCustomerIdService {

	@Autowired
	GetCustomerIdRepository customerRepo;
	
	@Override
	public GetCustomerId getCustomerById(int id) {
		
		Optional<GetCustomerId> customer = customerRepo.findById(id);
		GetCustomerId custId = customer.get();
		return custId;
	}
	
	

}
