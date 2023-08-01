package com.tcs.bookmyshow.service;

import com.tcs.bookmyshow.dto.Movie;
import com.tcs.bookmyshow.dto.MovieDto;

public interface MovieService {
	
	public Movie savemovieDetailes(MovieDto moviedto) throws Exception;
	
	public String delateMovieDetailes(long movieID);


}
