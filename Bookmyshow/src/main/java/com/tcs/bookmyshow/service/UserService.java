package com.tcs.bookmyshow.service;

import com.tcs.bookmyshow.dto.User;

public interface UserService {

	 public User saveUserDetailes(User user);
	 
	 public Iterable<User> getallUserDetailes();
	 
	 public String delateuserbyId( Long id);
	 
	public User updateById(Long id , User user);
}
