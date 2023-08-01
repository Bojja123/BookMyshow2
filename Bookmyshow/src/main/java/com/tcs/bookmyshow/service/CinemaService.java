package com.tcs.bookmyshow.service;

import com.tcs.bookmyshow.dto.Cinema;
import com.tcs.bookmyshow.dto.CinemaDto;

public interface CinemaService {

	 public Cinema saveCinemaDetailes(CinemaDto cinemaDto);
	 
	 public Iterable<Cinema> getAllCinemadetailes();
	 
	 public String delateCinemaDetailes(long id);
	 
	 public Cinema updateCinemaDetailes(long id, Cinema cinema);
}
