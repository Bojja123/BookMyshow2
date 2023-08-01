package com.tcs.bookmyshow.service;

import com.tcs.bookmyshow.dto.Screen;

public interface ScreenService {


	public Screen saveScreenDetailes(Screen screen);
	
	public Iterable<Screen> getAllScreenDetailes();
	
	public String delateScreenDetailes(Long id);
	
	public Screen updateScreenDetailes(long id, Screen screen);


}
