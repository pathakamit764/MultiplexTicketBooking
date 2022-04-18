package com.MTB.DTOtoEntity;


import org.springframework.stereotype.Component;

import com.MTB.entites.Movies;



@Component
public class MovieDtoToEntity {
	public Movies convertMovieDtoToEntity(Movies moviesDTO) {
		Movies movies = new Movies();
		movies.setMovieId(moviesDTO.getMovieId());
		movies.setMovieName(moviesDTO.getMovieName());
		return movies;
	}
}