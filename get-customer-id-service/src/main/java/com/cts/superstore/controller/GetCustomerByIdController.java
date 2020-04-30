package com.cts.superstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.superstore.model.GetCustomerId;
import com.cts.superstore.service.GetCustomerIdService;

@RestController
public class GetCustomerByIdController {
	
	@Autowired
	GetCustomerIdService service;
	
	@GetMapping("customer/{id}")
	public GetCustomerId getCustomerById(@PathVariable int id)
	{
		
		GetCustomerId custId=service.getCustomerById(id);
		return custId;
		
	}

}
