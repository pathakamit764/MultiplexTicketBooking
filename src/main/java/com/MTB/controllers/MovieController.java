package com.MTB.controllers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MTB.entites.Movies;
import com.MTB.services.*;

@RestController
public class MovieController {
//	@Autowired
//	MovieDtoToEntity movieDtoToEntity;

	@Autowired
	MovieService movieservice;

	@CrossOrigin
	@PostMapping(value = "/addmovie")
    public Movies addMovie(@RequestBody Movies movies) {

		return movieservice.addMovie(movies);
	}
    @CrossOrigin
	@GetMapping("/getAllMovies")
	public List<Movies> getAllMovies() {

		return movieservice.getAllMovies();
	}
}