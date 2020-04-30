package com.cts.superstore.model;


public class CustomerPreference {
	
	
	
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
    
        public CustomerPreference() {
			// TODO Auto-generated constructor stub
		}

		public CustomerPreference(int id, String name, long phone, String email, String preferedContact,
				String workAddress, String homeAddress, String preferedAddress, String deliveryTimings,
				boolean offerUpdates, boolean availableOnSunday) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.email = email;
			this.preferedContact = preferedContact;
			this.workAddress = workAddress;
			this.homeAddress = homeAddress;
			this.preferedAddress = preferedAddress;
			this.deliveryTimings = deliveryTimings;
			this.offerUpdates = offerUpdates;
			this.availableOnSunday = availableOnSunday;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPreferedContact() {
			return preferedContact;
		}

		public void setPreferedContact(String preferedContact) {
			this.preferedContact = preferedContact;
		}

		public String getWorkAddress() {
			return workAddress;
		}

		public void setWorkAddress(String workAddress) {
			this.workAddress = workAddress;
		}

		public String getHomeAddress() {
			return homeAddress;
		}

		public void setHomeAddress(String homeAddress) {
			this.homeAddress = homeAddress;
		}

		public String getPreferedAddress() {
			return preferedAddress;
		}

		public void setPreferedAddress(String preferedAddress) {
			this.preferedAddress = preferedAddress;
		}

		public String getDeliveryTimings() {
			return deliveryTimings;
		}

		public void setDeliveryTimings(String deliveryTimings) {
			this.deliveryTimings = deliveryTimings;
		}

		public boolean isOfferUpdates() {
			return offerUpdates;
		}

		public void setOfferUpdates(boolean offerUpdates) {
			this.offerUpdates = offerUpdates;
		}

		public boolean isAvailableOnSunday() {
			return availableOnSunday;
		}

		public void setAvailableOnSunday(boolean availableOnSunday) {
			this.availableOnSunday = availableOnSunday;
		}

		

		@Override
		public String toString() {
			return "CustomerPreference [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email
					+ ", preferedContact=" + preferedContact + ", workAddress=" + workAddress + ", homeAddress="
					+ homeAddress + ", preferedAddress=" + preferedAddress + ", deliveryTimings=" + deliveryTimings
					+ ", offerUpdates=" + offerUpdates + ", availableOnSunday=" + availableOnSunday  + "]";
		}
        
        
}
