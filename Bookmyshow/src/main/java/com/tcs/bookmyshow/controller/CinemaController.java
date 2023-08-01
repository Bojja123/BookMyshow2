package com.tcs.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bookmyshow.dto.Cinema;
import com.tcs.bookmyshow.dto.CinemaDto;
import com.tcs.bookmyshow.service.CinemaService;
import com.tcs.bookmyshow.wrapper.CinemaResponseWrapper;

@RestController
@RequestMapping("/api/cine")
public class CinemaController {
	@Autowired
	public CinemaService cinemaService;

	@PostMapping("saveCinemaDetailes")
	public CinemaResponseWrapper saveCinemaDetailes(@RequestBody CinemaDto cinemaDto) {
		System.out.println("inside method");
		
		Cinema cinemaobj= cinemaService.saveCinemaDetailes(cinemaDto);
		CinemaResponseWrapper responseWrapper=new CinemaResponseWrapper();
		responseWrapper.setCinema(cinemaobj);
		responseWrapper.setStarus("HttpStatus.OK");
		responseWrapper.setMsg("cinema object saved succefully");
		return responseWrapper;

	}

	@GetMapping("/getAllCinemaDetailes")
	public Iterable<Cinema> getAllCinemadetailes() {
		return cinemaService.getAllCinemadetailes();

	}

	@DeleteMapping("/delatecinemadetailes/{id}")
	public String delatecinemadetailes(@PathVariable Long id) {
		cinemaService.delateCinemaDetailes(id);
		return "data is delated succefully" + id;

	}
	@PutMapping("/updatecinemadetailes/{id}")
	public Cinema updareCinemaDetailes(@PathVariable long id, @RequestBody Cinema cinema) {
		return cinemaService.updateCinemaDetailes(id, cinema);
	}
}
