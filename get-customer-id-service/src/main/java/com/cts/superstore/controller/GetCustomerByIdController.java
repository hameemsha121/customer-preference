package com.cts.superstore.controller;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.superstore.entity.CustomerEntity;
import com.cts.superstore.model.Customer;

import com.cts.superstore.service.GetCustomerIdServiceImplementation;
import com.cts.superstore.validator.GetCustomerIdValidator;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/cts/superstore")
public class GetCustomerByIdController {
	
	@Autowired
	GetCustomerIdServiceImplementation service;

	@Autowired
	GetCustomerIdValidator validator;
	
	@GetMapping(value = "/customer/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable("id") int id) {
		try {
			
			Customer customer = service.getCustomerById(id);
			boolean valid=validator.validate(customer);
			
			if(valid) {
			log.info("Getting Customer by customer id--> {}",customer);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
			}
			return new ResponseEntity<String>("Validation error",HttpStatus.NOT_ACCEPTABLE);
			} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("Customer not found", HttpStatus.NOT_FOUND);
		}
		
	}


}
