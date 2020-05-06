package com.cts.superstore.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
public @Data class CustomerPreferenceEntity implements Serializable{
	
	
	 
	private static final long serialVersionUID = -8370977052740734405L;
		@Id
	    @GeneratedValue
	    private int id;
	    private String name;
		@NotNull
		private long phone;
		@NotEmpty
		private String email;
		@NotNull
		private String preferedContact;
		@NotNull
		private String workAddress;
		@NotNull 
		private String homeAddress;
        @NotNull
		private String preferedAddress;
        @NotNull
        private String deliveryTimings;
        @NotNull
        private boolean offerUpdates;
        @NotNull
        private boolean availableOnSunday;
        @NotNull
        private LocalDate created;
        @NotNull
        private String createdBy;
        @NotNull
        private LocalDate updated;
        @NotNull
        private String updatedBy;
        @NotNull
        private boolean isActive;
        
        
        
}