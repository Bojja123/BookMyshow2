package com.tcs.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bookmyshow.dto.Movie;
import com.tcs.bookmyshow.dto.MovieDto;
import com.tcs.bookmyshow.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	public MovieService movieService;

	@PostMapping("/savemoviedetailes")
	public Movie savemoviedetailes(@RequestBody MovieDto moviedto) throws Exception {
		return movieService.savemovieDetailes(moviedto);
	}
  @DeleteMapping("delate/{movieId}")
	public String delateMovieDetailes(@PathVariable long movieid) {
	  movieService.delateMovieDetailes(movieid);
	  return "data is delated succefully" +movieid;
  }
}
