package com.tcs.bookmyshow.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.bookmyshow.dto.User;
import com.tcs.bookmyshow.repository.UserRepository;
import com.tcs.bookmyshow.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserRepository userRepository;

	@Override
	public User saveUserDetailes(User user) {
		return userRepository.save(user);
	}

	@Override
	public Iterable<User> getallUserDetailes() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public String delateuserbyId(Long id) {

		userRepository.deleteById(id);
		return "user data is delated based on id" + id;
	}

	@Override
	public User updateById(Long id, User user) {
		User exitingUser = userRepository.findById(id).get();
		exitingUser.setUsernamae(user.getUsernamae());
		exitingUser.setPassword(user.getPassword());
		exitingUser.setEmail(user.getEmail());
		exitingUser.setAddress(user.getAddress());
		exitingUser.setMobileno(user.getMobileno());
		return userRepository.save(exitingUser);

	}

}
