package com.cts.superstore.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cts.superstore.entity.CustomerPreferenceEntity;
import com.cts.superstore.model.CustomerPreference;
import com.cts.superstore.service.CustomerPreferenceService;

@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerPreferenceControllerTest {
	
	@InjectMocks
	private CustomerPreferenceController controller;
	
	@Mock
	private CustomerPreferenceService service; 
	
	@Test
	public void getAllCustomersTest() throws InterruptedException {
		List<CustomerPreferenceEntity> list = new ArrayList<CustomerPreferenceEntity>();
	
		LocalDate created = LocalDate.now();
		LocalDate updated = LocalDate.now();
		CustomerPreferenceEntity preference1 = new CustomerPreferenceEntity(7, "tanu", 8888888888L, "tanu@gmail.com", "phn", "cts", "asv", "work", "9-12", true, true,created,"rep",updated,"cust",true);
		CustomerPreferenceEntity preference2 = new CustomerPreferenceEntity(7, "tanu", 8888888888L, "tanu@gmail.com", "phn", "cts", "asv", "work", "9-12", true, true,created,"rep",updated,"cust",true);
	
     	list.add(preference1);
		list.add(preference2);
	
		when(service.getAllCustomers()).thenReturn(list);
	
		List<CustomerPreferenceEntity> patientList = (List<CustomerPreferenceEntity>) controller.getAllCustomers().getBody();
	
		assertEquals(2, patientList.size());
		verify(service, times(1)).getAllCustomers();
	}
	
	@Test
	public void getAllCustomersTestForException() throws InterruptedException {
			
	 Exception exception = assertThrows(NullPointerException.class, () -> {
			when(service.getAllCustomers()).thenThrow(NullPointerException.class);
			controller.getAllCustomers();
		});
	
		assertNotNull(exception);
	verify(service, times(1)).getAllCustomers();
	}


	@Test
	public void updateTest() throws Exception{
		
//		LocalDate created = LocalDate.now();
//		LocalDate updated = LocalDate.now();
        CustomerPreferenceEntity preference = new CustomerPreferenceEntity();
		CustomerPreference customerPreference = new CustomerPreference(7, "tanu",  9345678989L , "tanu@gmail.com", "phn", "cts", "asv", "work", "9-12", true, true);
		when(service.updateCustomerPreference(customerPreference)).thenReturn(preference);
		//CustomerPreferenceEntity customerPreferenceEntity = (CustomerPreferenceEntity) controller.update(customerPreference).getBody();
		assertTrue(preference.equals(controller.update(customerPreference).getBody()));
		verify(service,times(1)).updateCustomerPreference(customerPreference);
		
	}
	
	@Test
	public void updateTestException() throws InterruptedException {
			
		CustomerPreference customerPreference = new CustomerPreference(7, "tanu", 8888888888L, "tanu@gmail.com", "phn", "cts", "asv", "work", "9-12", true, true);
		Exception exception = assertThrows(NullPointerException.class, () -> {
			when(service.updateCustomerPreference(customerPreference)).thenThrow(NullPointerException.class);
			controller.update(customerPreference);
		});

		assertNotNull(exception);
		verify(service, times(1)).updateCustomerPreference(customerPreference);
	}
}
