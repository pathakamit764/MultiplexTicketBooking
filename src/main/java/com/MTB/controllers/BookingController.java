package com.MTB.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.dto.BookingDTO;
import com.cinema.dtotoentity.BookingDtoToEntity;
import com.cinema.exception.BookingNotAddedException;
import com.cinema.exceptionhandler.Constants;
import com.cinema.service.BookingService;

@RestController
public class BookingController {
	@Autowired
      BookingService  bookingService;
	@Autowired
	BookingDtoToEntity bookingDtoToEntity;
	  
	  @CrossOrigin
	  @PostMapping("/addbooking")
	  public String addBooking(@RequestBody BookingDTO booking) throws BookingNotAddedException {
		  boolean isBookingAdded=bookingService.addBooking(bookingDtoToEntity.convertbookingDtoToEntity(booking));
		  if(isBookingAdded) {
			  return Constants.SUCCESS;
		  }else {
			  throw new BookingNotAddedException();
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