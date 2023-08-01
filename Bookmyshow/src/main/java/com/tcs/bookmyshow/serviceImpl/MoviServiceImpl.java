package com.tcs.bookmyshow.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.bookmyshow.dto.Movie;
import com.tcs.bookmyshow.dto.MovieDto;
import com.tcs.bookmyshow.repository.MovieRepository;
import com.tcs.bookmyshow.service.MovieService;

@Service
public class MoviServiceImpl implements MovieService {
     @Autowired
	public MovieRepository movieRepository;

	@Override
	public Movie savemovieDetailes(MovieDto moviedto) throws Exception {
		// Format of the input date (adjust this according to your date format)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parsing the input date to java.util.Date
        Date parsedDate = dateFormat.parse(moviedto.getReleaseDate());
		
		Movie movie = new Movie();
		movie.setTittle(moviedto.getTittle());
		movie.setMoviecycle(moviedto.getMoviecycle());
		movie.setReleaseDate(parsedDate);
		movieRepository.save(movie);
		return movie;
	
	}

	@Override
	public String delateMovieDetailes(long movieID) {
		movieRepository.deleteById(movieID);
		return "data is delated succefully"+movieID;
	}

	}


