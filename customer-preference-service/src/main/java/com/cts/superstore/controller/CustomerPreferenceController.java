package com.cts.superstore.controller;

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

		
	@Autowired
	CustomerPreferenceService customerPreferenceService;
	
	@PutMapping("/customer")
	public ResponseEntity<CustomerPreferenceEntity> update(@RequestBody CustomerPreferenceEntity customerPreference) {
		
		CustomerPreferenceEntity customerPreferenceEntity = customerPreferenceService.updateCustomerPreference(customerPreference);
		return new ResponseEntity<CustomerPreferenceEntity>(customerPreferenceEntity,HttpStatus.OK);
	}

}



