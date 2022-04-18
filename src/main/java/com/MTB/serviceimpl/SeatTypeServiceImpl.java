package com.MTB.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTB.entites.SeatType;
import com.MTB.repository.SeatTypeRepository;
import com.MTB.services.SeatTypeService;

@Service
public class SeatTypeServiceImpl implements SeatTypeService {
	@Autowired
	SeatTypeRepository seatTypeRepo;

	@Override
	public Boolean addSeatType(SeatType seattype) {
		if (seattype.getSeatFare() >= 0 && !seattype.getSeatTypeDesc().isEmpty() && seattype.getSeatTypeId() != 0) {
			seatTypeRepo.save(seattype);
			return true;
		} else {
			return false;
		}
	}

}