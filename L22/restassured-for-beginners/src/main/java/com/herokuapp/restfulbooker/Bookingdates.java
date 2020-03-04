package com.herokuapp.restfulbooker;


public class Bookingdates {
	private String checkin;
	private String checkout;
	
	public Bookingdates(String checkin, String checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	
	public Bookingdates() {
	}


	@Override
	public String toString() {
		return "Bookingdates [checkin=" + checkin + ", checkout=" + checkout + "]";
	}


	public String getCheckin() {
		return checkin;
	}

	
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	
	public String getCheckout() {
		return checkout;
	}

	
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

}
