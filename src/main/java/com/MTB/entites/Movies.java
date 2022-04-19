package com.MTB.entites;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Movie_Master")
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer movieId;
   private  String movieName;
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY,
           cascade = CascadeType.ALL)
   private Set<Shows> shows;

}
