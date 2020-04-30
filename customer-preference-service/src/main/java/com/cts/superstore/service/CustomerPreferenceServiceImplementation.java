package com.cts.superstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.superstore.entity.CustomerPreferenceEntity;
import com.cts.superstore.model.CustomerPreference;
import com.cts.superstore.repository.CustomerPreferenceRepository;

@Service
public class CustomerPreferenceServiceImplementation implements CustomerPreferenceService{
	
	@Autowired
	CustomerPreferenceRepository CustomerPreferenceRepo;

	@Override
	public CustomerPreferenceEntity updateCustomerPreference(CustomerPreferenceEntity customerPreferenceEntity) {
		CustomerPreference customerPreference = new CustomerPreference();
		return null;
	}

	@Override
	public List<CustomerPreferenceEntity> getCustomerPreferenceByDate() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
