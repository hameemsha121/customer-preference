package com.cts.superstore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.superstore.entity.CustomerPreferenceEntity;

import com.cts.superstore.service.CustomerPreferenceService;


@RestController
public class CustomerPreferenceController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	

		
	@Autowired
	CustomerPreferenceService customerPreferenceService;
	
	@PutMapping("/customer")
	public ResponseEntity<CustomerPreferenceEntity> update(@RequestBody CustomerPreferenceEntity customerPreference) {
		
		logger.info("Get All updated info........");
		CustomerPreferenceEntity customerPreferenceEntity = customerPreferenceService.updateCustomerPreference(customerPreference);
		logger.info("updated --> {}",customerPreferenceEntity);
		return new ResponseEntity<CustomerPreferenceEntity>(customerPreferenceEntity,HttpStatus.OK);
	}

}



