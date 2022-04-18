package com.MTB.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTB.entites.Movies;
import com.MTB.repository.MoviesRepository;
import com.MTB.services.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
@Autowired
MoviesRepository movierepositary;

@Override
public Movies addMovie(Movies movies) {
	
	return movierepositary.save(movies);
}

@Override
public List<Movies> getAllMovies() {
	List<Movies> movie=(List<Movies>) movierepositary.findAll();
	return movie;
}

	

}