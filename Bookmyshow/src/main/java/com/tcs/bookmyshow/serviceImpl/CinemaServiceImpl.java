package com.tcs.bookmyshow.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.bookmyshow.dto.Cinema;
import com.tcs.bookmyshow.dto.CinemaDto;
import com.tcs.bookmyshow.dto.User;
import com.tcs.bookmyshow.repository.CinemaRepository;
import com.tcs.bookmyshow.repository.UserRepository;
import com.tcs.bookmyshow.service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService {
	@Autowired
	public CinemaRepository cinemaRepository;
	@Autowired
	public UserRepository userRepository;
	

	@Override
	public Cinema saveCinemaDetailes(CinemaDto cinemaDto) {
		Cinema cinema=new Cinema();
		Long userId = 1L;  
		User user1= userRepository.findById(userId).get();
		cinema.setUser(user1);
		cinema.setCinemaType(cinemaDto.getCinemaType());
		
		return cinemaRepository.save(cinema);
	}

	@Override
	public Iterable<Cinema> getAllCinemadetailes() {

		return cinemaRepository.findAll();
	}

	@Override
	public String delateCinemaDetailes(long id) {

		cinemaRepository.deleteById(id);
		return "data is delated the succefully" + id;
	}

	@Override
	public Cinema updateCinemaDetailes(long id, Cinema cinema) {

		Cinema exicitngcinema = cinemaRepository.findById(id).get();
		exicitngcinema.setCinemaType(cinema.getCinemaType());
		return exicitngcinema;

	}

}
