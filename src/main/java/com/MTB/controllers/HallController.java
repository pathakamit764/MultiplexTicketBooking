package com.MTB.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.dto.HallDTO;
import com.cinema.dtotoentity.HallDtoToEntity;
import com.cinema.entity.Hall;
import com.cinema.service.HallService;
@RestController
public class HallController {
	@Autowired
	HallService hallservce;
	@Autowired
	HallDtoToEntity hallDtoToEntity;

	@PostMapping(value = "/addhall")

	public Hall addMovie(@RequestBody HallDTO hall) {
		return hallservce.addHall(hallDtoToEntity.convertHallDtoToEntity(hall));
	}
}