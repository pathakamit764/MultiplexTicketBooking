package com.MTB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.dto.SeatTypeDTO;
import com.cinema.dtotoentity.SeatTypeDtoToEntity;
import com.cinema.exceptionhandler.Constants;
import com.cinema.service.SeatTypeService;

@RestController
public class SeatTypeController {
	@Autowired
	SeatTypeService seatTypeService;
	@Autowired
	SeatTypeDtoToEntity seatTypeDtoToEntity;

	@PostMapping("/addSeatType")
	public String addSeatType(@RequestBody SeatTypeDTO seattype) {
		
		boolean isSeatAdded = seatTypeService.addSeatType(seatTypeDtoToEntity.convertSeatTypeDtoToEntity(seattype));
		if (isSeatAdded) {
			return Constants.SUCCESS;
		} else {
			return Constants.FAILED;
		}
	}

}