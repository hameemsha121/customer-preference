package com.cts.superstore.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cts.superstore.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
class GetCustomerByIdControllerTest {

	@InjectMocks
	GetCustomerByIdController getCustomerByIdController;
	
	
	@Test
	public void testgetCustomerById() throws Exception {
		
		Customer customer=new Customer(101,"Malavika",34567,"mal@gmail.com","phone","work","hno8","home","9-12",1,1);
	}

}
