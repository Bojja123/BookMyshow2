package com.tcs.bookmyshow.wrapper;

import com.tcs.bookmyshow.dto.Cinema;
import com.tcs.bookmyshow.dto.User;

public class UserResponseWrapper {
	

	private String starus;
	private String msg;
	private User user;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
