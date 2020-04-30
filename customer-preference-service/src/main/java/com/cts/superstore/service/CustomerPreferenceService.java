package com.cts.superstore.service;

import java.util.List;

import com.cts.superstore.entity.CustomerPreferenceEntity;
//import com.cts.superstore.model.CustomerPreference;

public interface CustomerPreferenceService {
	
	public CustomerPreferenceEntity updateCustomerPreference(CustomerPreferenceEntity customerPreferenceEntity);
	public List<CustomerPreferenceEntity> getCustomerPreferenceByDate();

}
