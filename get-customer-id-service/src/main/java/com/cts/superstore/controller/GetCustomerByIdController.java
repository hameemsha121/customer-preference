package com.cts.superstore.controller;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.superstore.model.Customer;
import com.cts.superstore.service.GetCustomerByIdService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("cts/superstore")
@RestController
@Slf4j
public class GetCustomerByIdController {
	
	@Autowired
	GetCustomerByIdService getCustomerByIdservice;

	
	@GetMapping(value = "/customer/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable("id") int id) {
		try {
			Customer customer = getCustomerByIdservice.getCustomerById(id);
			log.info("Getting Customer by customer id--> {}",customer);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("Customer not found", HttpStatus.NOT_FOUND);
		}
	}


}
