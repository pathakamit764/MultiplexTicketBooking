package com.MTB.DTOtoEntity;

import org.springframework.stereotype.Component;

import com.MTB.dto.HallDTO;
import com.MTB.entites.Hall;


@Component
public class HallDtoToEntity {
	public Hall convertHallDtoToEntity(HallDTO hallDTO) {
		Hall hall =  new Hall();
		hall.setHallDesc(hallDTO.getHallDesc());
		hall.setHallId(hallDTO.getHallId());
		hall.setTotalCapacity(hallDTO.getTotalCapacity());
		
		return hall;
	}
}