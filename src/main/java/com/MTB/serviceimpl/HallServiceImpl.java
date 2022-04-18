package com.MTB.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTB.entites.Hall;
import com.MTB.repository.HallRepository;
import com.MTB.services.HallService;

@Service
public class HallServiceImpl implements HallService {
@Autowired
HallRepository hallrepositary;
	@Override
	public Hall addHall(Hall hall) {
		return hallrepositary.save(hall);
	}

}