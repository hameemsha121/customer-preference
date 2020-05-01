package com.cts.superstore.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customer")
public @Data class GenerateReport implements Serializable{
	
	 @Id
	 @GeneratedValue
	 private int id;
	 private String name;
	 private long phone;
	 private String email;
     private String preferedContact;
     private String workAddress;
     private String homeAddress;
     private String preferedAddress;
     private String deliveryTimings;
     private boolean offerUpdates;
     private boolean availableOnSunday;
     private LocalDate created;
     private String createdBy;
     private LocalDate updated;
     private String updatedBy;
     private boolean isActive;

}
