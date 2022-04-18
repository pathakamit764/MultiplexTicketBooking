package com.MTB.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MTB.*;
import com.MTB.entites.Booking;

//import com.cinema.dto.BookingDTO;
//import com.cinema.dtotoentity.BookingDtoToEntity;
//import com.cinema.exception.BookingNotAddedException;
//import com.cinema.exceptionhandler.Constants;
//import com.cinema.service.BookingService;

@RestController
public class BookingController {
	@Autowired
      Booking  bookingService;
	@Autowired
	BookingDtoToEntity bookingDtoToEntity;
	  
	  @CrossOrigin
	  @PostMapping("/addbooking")
	  public String addBooking(@RequestBody Booking booking) throws com.MTB.exception.BookingNotAddedException {
		  boolean isBookingAdded=bookingService.addBooking(bookingDtoToEntity.convertbookingDtoToEntity(booking));
		  if(isBookingAdded) {
			  return Constants.SUCCESS;
		  }else {
			  throw new com.MTB.exception.BookingNotAddedException();
		  }
		  }
	@PostMapping("/cancelBooking")
	  public String cancelBooking(@RequestParam Integer id) {
		  boolean isBookingAdded=bookingService.cancelBooking(id);
		  if(isBookingAdded) {
			  return Constants.SUCCESS;
		  }else {
			  return Constants.FAILED;
		  }
		  }
}