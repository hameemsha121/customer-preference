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

@Service
public class GenerateReportServiceImplemenation implements GenerateReportService{

	@Autowired
	GenerateReportRepository generateReportRepo;
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public List<GenerateReportModel> getCustomerUpdatedByDate() {
		List<GenerateReport> entities=generateReportRepo.findAll();
		List<GenerateReportModel> list=new ArrayList<GenerateReportModel>();
		for(GenerateReport entity:entities) {
			GenerateReportModel generateReport=new GenerateReportModel();
			BeanUtils.copyProperties(entity,generateReport);
			LocalDate a=LocalDate.now();
			//System.out.println(entity.getUpdated());
			if(entity.getUpdated().equals(a)) {
				list.add(generateReport);
			}
	}
		log.info("The entities-->{}",entities);
		//System.out.println("Entity:"+entities);
		//System.out.println("DTO: "+list);
		log.info("The Used fields table is--->{}",list);
		LocalDate b=LocalDate.now();
		//System.out.println(b);
		return list;
	}

}
