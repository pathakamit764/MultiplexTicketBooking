package com.MTB.DTOtoEntity;

import org.springframework.stereotype.Component;

import com.MTB.dto.BookingDTO;
import com.MTB.entites.Booking;

@Component
public class BookingDtoToEntity {
	public Booking convertbookingDtoToEntity(BookingDTO bookingDTO) {
		Booking booking = new Booking();
		booking.setBookedDate(bookingDTO.getBookedDate());
		booking.setBookingId(bookingDTO.getBookingId());
		booking.setShowDate(bookingDTO.getShowDate());
		booking.setShows(bookingDTO.getShows());
		booking.setUser(bookingDTO.getUser());
		booking.setNoOfSeats(bookingDTO.getNoOfSeats());
		booking.setSeatType(bookingDTO.getSeatTypeId());
		return booking;
	
	}
	
	
}