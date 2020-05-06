package com.cts.superstore.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.superstore.entity.CustomerPreferenceEntity;
import com.cts.superstore.model.CustomerPreference;

import com.cts.superstore.service.CustomerPreferenceServiceImplementation;
import com.cts.superstore.validator.CustomerPreferenceValidator;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/cts/superstore")
public class CustomerPreferenceController {

		
	@Autowired
	CustomerPreferenceServiceImplementation customerPreferenceService;
	
	@Autowired
	CustomerPreferenceValidator validator;
	

	
	@PutMapping(value="/customer", consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> update(@RequestBody CustomerPreferenceEntity preferenceReq) {
	   log.info("Inside Customer Preference:get details");
	   String error=validator.validate(preferenceReq);
	   
	   if(error.equals(" ")) {
	   customerPreferenceService.updateCustomerPreference(preferenceReq);
	   return new ResponseEntity<>(preferenceReq,HttpStatus.OK);
	   }
	   if(error.equals("emailError")) 
		   return new ResponseEntity<String>("Error in Email Format",HttpStatus.NOT_ACCEPTABLE);
	   if(error.equals("nameError"))
		   return new ResponseEntity<String>("Error in Name Format",HttpStatus.NOT_ACCEPTABLE);
	   if(error.equals("phoneError"))
		   return new ResponseEntity<String>("Error in phone Format",HttpStatus.NOT_ACCEPTABLE);
	   else
		   return new ResponseEntity<String>("Validation Error",HttpStatus.NOT_ACCEPTABLE);
	}

}



