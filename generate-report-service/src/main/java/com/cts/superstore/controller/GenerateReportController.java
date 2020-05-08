package com.cts.superstore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cts.superstore.entity.GenerateReport;
import com.cts.superstore.model.GenerateReportModel;
import com.cts.superstore.repository.GenerateReportRepository;
import com.cts.superstore.service.GenerateReportServiceImplemenation;
import com.cts.superstore.validator.GenerateReportValidator;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableHystrix
@RequestMapping("/cts/superstore")
public class GenerateReportController {

	@Autowired
	GenerateReportRepository generateReportRepo;

	@Autowired
	GenerateReportServiceImplemenation generateReportService;

	@Autowired
	GenerateReportValidator validator;

	@GetMapping("/getreport")
	@HystrixCommand(fallbackMethod = "errorMessage")
	public ResponseEntity<?> getCustomerUpdatedByDate() {

		List<GenerateReportModel> customerList = generateReportService.getCustomerUpdatedByDate();
		if (customerList.size() > 0) {
			return new ResponseEntity<List>(customerList, HttpStatus.OK);
		} 
			return new ResponseEntity<String>("No data", HttpStatus.NOT_FOUND);
		
	}

	public ResponseEntity<?> errorMessage() {
		return new ResponseEntity<String>("no user updated today", HttpStatus.NOT_FOUND);
	}

}
