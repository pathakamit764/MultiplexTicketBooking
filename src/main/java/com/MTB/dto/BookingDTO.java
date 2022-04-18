package com.MTB.dto;

import java.sql.Date;

import com.MTB.entites.SeatType;
import com.MTB.entites.Shows;
import com.MTB.entites.Users;

public class BookingDTO {

	private Integer bookingId;

	private Users user;

	private Shows shows;
	private Date bookedDate;
	private Date showDate;
	private SeatType seatType;
	private Integer noOfSeats;
	

	public SeatType getSeatTypeId() {
		return seatType;
	}

	public void setSeatTypeId(SeatType seatType) {
		this.seatType = seatType;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Shows getShows() {
		return shows;
	}

	public void setShows(Shows shows) {
		this.shows = shows;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

}
