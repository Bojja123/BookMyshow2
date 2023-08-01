package com.tcs.bookmyshow.dto;

public class CinemaDto {

	private String cinemaType;
	
	private Long userID;

	public String getCinemaType() {
		return cinemaType;
	}

	public void setCinemaType(String cinemaType) {
		this.cinemaType = cinemaType;
	}
	
	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "CinemaDto [cinemaType=" + cinemaType + ", userID=" + userID + "]";
	}
	
	
	
}
