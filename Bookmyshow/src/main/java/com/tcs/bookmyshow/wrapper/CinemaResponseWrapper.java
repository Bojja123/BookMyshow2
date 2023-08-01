package com.tcs.bookmyshow.wrapper;

import com.tcs.bookmyshow.dto.Cinema;

public class CinemaResponseWrapper {

	private String starus;
	private String msg;
	private Cinema cinema;
	public String getStarus() {
		return starus;
	}
	public void setStarus(String starus) {
		this.starus = starus;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	@Override
	public String toString() {
		return "ResponseWrapper [starus=" + starus + ", msg=" + msg + "]";
	}
	
	
	
}
