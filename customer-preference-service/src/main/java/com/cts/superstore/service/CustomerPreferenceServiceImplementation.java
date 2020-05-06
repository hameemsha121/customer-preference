package com.cts.superstore.service;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.superstore.entity.CustomerPreferenceEntity;
import com.cts.superstore.model.CustomerPreference;
import com.cts.superstore.repository.CustomerPreferenceRepository;

@Service
public class CustomerPreferenceServiceImplementation {
	
	
	
	@Autowired
	CustomerPreferenceRepository customerPreferenceRepo;

	public CustomerPreferenceEntity updateCustomerPreference(CustomerPreferenceEntity customerPreferenceEntity) {
//		CustomerPreference customerPreference = new CustomerPreference();
//		BeanUtils.copyProperties(customerPreferenceEntity, customerPreference);
		BeanUtils.copyProperties(customerPreferenceRepo.save(customerPreferenceEntity), customerPreferenceEntity);
		  System.out.println(customerPreferenceEntity);
			
		return customerPreferenceEntity;
	}
  
}
