package com.cts.superstore.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.superstore.model.GenerateReport;
import com.cts.superstore.repository.GenerateReportRepository;

@Service
public class GenerateReportServiceImplemenation implements GenerateReportService{

	@Autowired
	GenerateReportRepository generateReportRepo;
	
	@Override
	public List<GenerateReport> getCustomerUpdatedByDate() {
		List<GenerateReport> entities=generateReportRepo.findAll();
		List<GenerateReport> list=new ArrayList<GenerateReport>();
		for(GenerateReport entity:entities) {
			GenerateReport generateReport=new GenerateReport();
			BeanUtils.copyProperties(entity,generateReport);
			LocalDate a=LocalDate.now();
			System.out.println(entity.getUpdated());
			if(entity.getUpdated().equals(a)) {
				list.add(generateReport);
			}
	}
		System.out.println("Entity:"+entities);
		System.out.println("DTO: "+list);
		LocalDate b=LocalDate.now();
		System.out.println(b);
		return list;
	}

}
