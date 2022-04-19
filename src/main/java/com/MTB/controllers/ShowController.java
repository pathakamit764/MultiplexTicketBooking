package com.MTB.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MTB.services.*;
import com.MTB.entites.Shows;
import com.MTB.exception.ShowException;


@RestController
public class ShowController {
	@Autowired
	ShowService showservice;
//	@Autowired
//	ShowsDtoToEntity showsDtoToEntity;
	@CrossOrigin
	@PostMapping(value = "/addshow")
	public Shows addMovie(@RequestBody Shows shows) {
		return showservice.addShow(shows);
	}
	
	@GetMapping("/showById/{showId}")
	public Shows getshowById(@PathVariable Integer showId) {
	Shows show = showservice.getShowId(showId);
		if (show != null) {
			return show;
		} else {
			throw new ShowException();
		}
	}
	@CrossOrigin
	@GetMapping("/getAllShows")
	public List<Shows> getAllShows() {
		List<Shows> shows = showservice.getAllShows();
			if (shows != null) {
				return shows;
			} else {
				throw new ShowException();
			}
		}
    
	
}