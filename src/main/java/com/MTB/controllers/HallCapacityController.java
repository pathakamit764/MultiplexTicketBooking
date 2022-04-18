package com.MTB.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MTB.services.HallCapacityService;
import com.MTB.DTOtoEntity.*;
import com.MTB.dto.*;
import com.MTB.exceptionHandler.Constants;

@RestController
public class HallCapacityController {
	@Autowired
	HallCapacityService hallCapacityservice;
	@Autowired
	HallCapacityDtoToEntity hallCapacityDtoToEntity;

	@PostMapping("/addCapacity")
	public String addCapacity(@RequestBody HallCapacityDTO hallcapa) {
		boolean isAdded = hallCapacityservice.addCapacity(hallCapacityDtoToEntity.convertHallCapacityDtoToEntity(hallcapa));
		if (isAdded) {
			return Constants.SUCCESS;
		} else {
			return Constants.FAILED;
		}
	}

}