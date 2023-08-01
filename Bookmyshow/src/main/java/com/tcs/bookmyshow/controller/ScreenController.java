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

import com.tcs.bookmyshow.dto.Screen;
import com.tcs.bookmyshow.service.ScreenService;

@RestController
@RequestMapping("/screen")
public class ScreenController {
	@Autowired
	public ScreenService screenService;

	@PostMapping("/savescreendetailes")
	public Screen saveScreenDetailes(@RequestBody Screen screen) {

		return screenService.saveScreenDetailes(screen);
	}

	@GetMapping("/getAllScreens")
	public Iterable<Screen> getAllScreens() {
		return screenService.getAllScreenDetailes();

	}
    @DeleteMapping("delateScreenDetailes/{id}")
	public String delateScreendetailes(@PathVariable long id) {
		screenService.delateScreenDetailes(id);
		
		return "delate screen detailes succefully" +id;
	}
    @PutMapping("updateScreenDetailes/{id}")
    public Screen updateScreenDetailes(@PathVariable long id, @RequestBody Screen screen) {
    
    return	screenService.updateScreenDetailes(id, screen);
    }
	
}
