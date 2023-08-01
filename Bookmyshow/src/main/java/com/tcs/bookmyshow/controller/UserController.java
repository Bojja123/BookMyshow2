package com.tcs.bookmyshow.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bookmyshow.dto.User;
import com.tcs.bookmyshow.service.UserService;
import com.tcs.bookmyshow.wrapper.UserResponseWrapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserController {

	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(UserController.class);
	@Autowired
	public UserService userService;

	@PostMapping("/saveuserdetailes")
	public UserResponseWrapper saveuserdetaiels(@RequestBody User user) {		
    logger.info("insdide the saveuser deatilrs");
   // logger.error("An error occurred: {}", exception.getMessage());
	User userobj= userService.saveUserDetailes(user);
	UserResponseWrapper userresponseWrapper=new UserResponseWrapper();
	userresponseWrapper.setUser(userobj);
	userresponseWrapper.setStarus("HttpStatus.OK");
	userresponseWrapper.setMsg("save user object succefully");
	return userresponseWrapper;
	

	}

	@GetMapping("/getAllUserDetailes")
	public Iterable<User> getallUserdeatiles() {
		return userService.getallUserDetailes();

	}

	@DeleteMapping("/delateuserdetailesbyid/{id}")
	public String delateUserDetailesbyid(@PathVariable Long id) {
		return userService.delateuserbyId(id);
	}

	@PutMapping("/updateByid/{id}")
	public User updateUserByid(@PathVariable long id, @RequestBody User user) {
		return userService.updateById(id, user);

	}

}
