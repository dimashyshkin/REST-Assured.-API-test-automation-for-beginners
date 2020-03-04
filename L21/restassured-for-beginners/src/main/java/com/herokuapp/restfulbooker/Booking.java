package com.herokuapp.restfulbooker;


public class Booking {
	
	private String firstname;
	private String lastname;
	private int totalprice;
	private boolean depositpaid;
	private Bookingdates bookingdates;
	private String additionalneeds;
	
	public Booking(String firstname, String lastname, int totalprice, boolean depositpaid, Bookingdates bookingdates, String additionalneeds) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.bookingdates = bookingdates;
		this.additionalneeds = additionalneeds;
	}

	
	@Override
	public String toString() {
		return "Booking [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice + ", depositpaid=" + depositpaid
				+ ", bookingdates=" + bookingdates + ", additionalneeds=" + additionalneeds + "]";
	}


	public String getFirstname() {
		return firstname;
	}

	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	
	public String getLastname() {
		return lastname;
	}

	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	public int getTotalprice() {
		return totalprice;
	}

	
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	
	public boolean isDepositpaid() {
		return depositpaid;
	}

	
	public void setDepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}

	
	public Bookingdates getBookingdates() {
		return bookingdates;
	}

	
	public void setBookingdates(Bookingdates bookingdates) {
		this.bookingdates = bookingdates;
	}

	
	public String getAdditionalneeds() {
		return additionalneeds;
	}

	
	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}
	


}
