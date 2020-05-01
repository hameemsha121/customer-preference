package com.cts.superstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.superstore.model.GenerateReport;
import com.cts.superstore.repository.GenerateReportRepository;
import com.cts.superstore.service.GenerateReportService;


@RestController
public class GenerateReportController {

	@Autowired
	GenerateReportRepository generateReportRepo;
	
	@Autowired
	GenerateReportService generateReportService;
	
	@GetMapping("/getreport")
	public ResponseEntity<?>getCustomerUpdatedByDate(){
		List<GenerateReport> list= generateReportService.getCustomerUpdatedByDate();
		if(list.size()>0) {
			return new ResponseEntity<List>(list,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No data",HttpStatus.NOT_FOUND);
		}
			
		
	}
	
}
