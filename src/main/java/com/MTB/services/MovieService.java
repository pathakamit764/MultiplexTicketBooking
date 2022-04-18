package com.MTB.services;

import java.util.List;

import com.MTB.entites.Movies;

public interface MovieService {
	public Movies addMovie(Movies movies);

	public List<Movies> getAllMovies();	
}
