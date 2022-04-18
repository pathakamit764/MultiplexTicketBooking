package com.MTB.DTOtoEntity;

import org.springframework.stereotype.Component;

import com.MTB.dto.SeatTypeDTO;
import com.MTB.entites.SeatType;



@Component
public class SeatTypeDtoToEntity {
	 public SeatType convertSeatTypeDtoToEntity(SeatTypeDTO seatTypeDto) {
		 SeatType st = new SeatType();
		 st.setSeatFare(seatTypeDto.getSeatFare());
		 st.setSeatTypeDesc(seatTypeDto.getSeatTypeDesc());
		 st.setSeatTypeId(seatTypeDto.getSeatTypeId());
		 
		 return st;
	 }
}