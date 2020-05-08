package com.cts.superstore.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class GenerateReportModel {

	
	 public GenerateReportModel() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	 private String name;
	 private String preferedContact;
     private String preferedAddress;
     private String deliveryTimings;
     private boolean offerUpdates;
     private boolean availableOnSunday;
     private LocalDate updated;
     private String updatedBy;
     
}
