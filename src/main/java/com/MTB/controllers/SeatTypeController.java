package com.MTB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MTB.services.*;
import com.MTB.entites.SeatType;
import com.MTB.exceptionHandler.Constants;


@RestController
public class SeatTypeController {
	@Autowired
	SeatTypeService seatTypeService;
//	@Autowired
//	SeatTypeDtoToEntity seatTypeDtoToEntity;

	@PostMapping("/addSeatType")
	public String addSeatType(@RequestBody SeatType seattype) {
		
		boolean isSeatAdded = seatTypeService.addSeatType(seattype);
		if (isSeatAdded) {
			return Constants.SUCCESS;
		} else {
			return Constants.FAILED;
		}
	}

}