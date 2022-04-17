package com.MTB.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cinema.dto.MoviesDTO;
import com.cinema.dtotoentity.MovieDtoToEntity;
import com.cinema.entity.Movies;
import com.cinema.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieDtoToEntity movieDtoToEntity;

	@Autowired
	MovieService movieservice;

	@CrossOrigin
	@PostMapping(value = "/addmovie")
    public Movies addMovie(@RequestBody MoviesDTO movies) {

		return movieservice.addMovie(movieDtoToEntity.convertMovieDtoToEntity(movies));
	}
    @CrossOrigin
	@GetMapping("/getAllMovies")
	public List<Movies> getAllMovies() {

		return movieservice.getAllMovies();
	}
}