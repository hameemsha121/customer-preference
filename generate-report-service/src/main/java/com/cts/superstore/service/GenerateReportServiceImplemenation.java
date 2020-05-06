package com.cts.superstore.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.superstore.entity.GenerateReport;
import com.cts.superstore.model.GenerateReportModel;
import com.cts.superstore.repository.GenerateReportRepository;
import com.cts.superstore.validator.GenerateReportValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GenerateReportServiceImplemenation {

	@Autowired
	GenerateReportRepository generateReportRepo;
	
	@Autowired
	GenerateReportValidator validator;
	
	public List<GenerateReportModel> getCustomerUpdatedByDate() {
		
		List<GenerateReport> entities=generateReportRepo.findAll();
		List<GenerateReportModel> customerList=new ArrayList<GenerateReportModel>();
		for(GenerateReport entity:entities) {
			if(validator.validate(entity)) {
			GenerateReportModel generateReportModel=new GenerateReportModel();
			BeanUtils.copyProperties(entity,generateReportModel);
			LocalDate a=LocalDate.now();
			//System.out.println(entity.getUpdated());
			if(entity.getUpdated().equals(a)) {
				customerList.add(generateReportModel);
			}
			}
		}
		log.info("The entities-->{}",entities);
		//System.out.println("Entity:"+entities);
		//System.out.println("DTO: "+list);
		log.info("The Used fields table is--->{}",customerList);
		LocalDate b=LocalDate.now();
		//System.out.println(b);
		return customerList;
	}

}
