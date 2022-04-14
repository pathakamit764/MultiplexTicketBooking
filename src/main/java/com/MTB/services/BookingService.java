package com.MTB.services;
import com.MTB.entites.Booking;

	public interface BookingService {

		public Boolean addBooking(Booking booking);

		public boolean cancelBooking(Integer id);

	}


