package com.cts.superstore.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Optional;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.NoSuchElementException;

import com.cts.superstore.entity.CustomerEntity;
import com.cts.superstore.model.Customer;
import com.cts.superstore.service.GetCustomerIdServiceImplementation;

import javassist.NotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(MockitoJUnitRunner.class)
public class GetCustomerByIdControllerTest {

	@InjectMocks
	private GetCustomerByIdController getCustomerByIdController;
	@Mock
	private GetCustomerIdServiceImplementation service;
	
	@Test
	public void getCustomerByIdTest() throws Exception {
		//Customer customer=new Customer(101, "mala", 2344432, "aa@gmail.com","phone", " aaaaaaaaa", "hno8", "home", "12:30 ", true, true);
		when(service.getCustomerById(101)).thenReturn(new Customer(101, "mala", 2344432, "aa@gmail.com","phone", " aaaaaaaaa", "hno8", "home", "12:30 ", true, true));
		Customer result = (Customer) getCustomerByIdController.getCustomerById(101).getBody();
		assertEquals(101, result.getId());
		verify(service,times(1)).getCustomerById(101);
		
	}	
	
	

	  @Test(expected=NoSuchElementException.class)
		public void getCustomerByIdExceptionTest() {
			
			Exception exception=assertThrows(NoSuchElementException.class, () -> {
				when(service.getCustomerById(1)).thenThrow(NoSuchElementException.class);
				getCustomerByIdController.getCustomerById(1);
			});
			
			assertNotNull(exception);
			verify(service,times(1)).getCustomerById(1);
		}
		
}
