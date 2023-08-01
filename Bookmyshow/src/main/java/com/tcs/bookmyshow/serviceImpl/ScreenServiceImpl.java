package com.tcs.bookmyshow.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.bookmyshow.dto.Screen;
import com.tcs.bookmyshow.repository.ScreenRepository;
import com.tcs.bookmyshow.service.ScreenService;

@Service
public class ScreenServiceImpl implements ScreenService {
	@Autowired
	public ScreenRepository screenRepository;

	@Override
	public Screen saveScreenDetailes(Screen screen) {
		
		return screenRepository.save(screen);
	}

	@Override
	public Iterable<Screen> getAllScreenDetailes() {
		
		return screenRepository.findAll();
	}

	@Override
	public String delateScreenDetailes(Long id) {
		
		screenRepository.deleteById(id);
		return "screen detailes delated succfully" +id;
	}

	@Override
	public Screen updateScreenDetailes(long id, Screen screen) {
		
	Screen exicitingscreen = screenRepository.findById(id).get();
	  exicitingscreen.setType(screen.getType());
	  return exicitingscreen;
		
	}

	
	


}
