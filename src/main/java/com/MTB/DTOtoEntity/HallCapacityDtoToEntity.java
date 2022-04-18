package com.MTB.DTOtoEntity;

import org.springframework.stereotype.Component;

import com.MTB.entites.HallCapacity;



@Component
public class HallCapacityDtoToEntity {
	public HallCapacity convertHallCapacityDtoToEntity(HallCapacity hallCapacityDTO) {
		HallCapacity hallCapacity = new HallCapacity();
		hallCapacity.setHallCapacityId(hallCapacityDTO.getHallCapacityId());
		hallCapacity.setHalls(hallCapacityDTO.getHalls());
		hallCapacity.setSeatCount(hallCapacityDTO.getHallCapacityId());
		hallCapacity.setSeatType(hallCapacityDTO.getSeatType());
		return hallCapacity;
		
		
	}

}