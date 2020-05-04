package com.cts.superstore.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.superstore.entity.CustomerEntity;
import com.cts.superstore.model.Customer;
import com.cts.superstore.repository.GetCustomerIdRepository;
import com.cts.superstore.service.GetCustomerIdService;

@RestController
public class GetCustomerByIdController {
	
	@Autowired
	GetCustomerIdService service;
	
	@Autowired
	GetCustomerIdRepository repo; 
	
	@GetMapping(value = "/customer/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable("id") int id) {
		try {
			Customer customer = service.getCustomerById(id);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("No customer found\n" + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
