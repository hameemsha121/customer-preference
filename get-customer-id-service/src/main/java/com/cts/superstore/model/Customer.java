package com.cts.superstore.model;

import lombok.Data;


public  @Data class Customer {


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
    

}
