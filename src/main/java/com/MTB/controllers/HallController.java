package com.MTB.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MTB.services.*;
import com.MTB.entites.Hall;

@RestController
public class HallController {
	@Autowired
	HallService hallservce;
//	@Autowired
//	HallDtoToEntity hallDtoToEntity;

	@PostMapping(value = "/addhall")

	public Hall addMovie(@RequestBody Hall hall) {
		return hallservce.addHall(hall);
	}
}