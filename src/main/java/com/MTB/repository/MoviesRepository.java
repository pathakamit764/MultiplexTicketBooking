package com.MTB.repository;

import org.springframework.data.repository.CrudRepository;

import com.MTB.entites.Movies;

public interface MoviesRepository extends CrudRepository<Movies, Integer> {

}