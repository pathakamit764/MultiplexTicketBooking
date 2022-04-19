package com.MTB.entites;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SeatType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer seatTypeId;
	private String seatTypeDesc;
	private float seatFare;

	public Integer getSeatTypeId() {
		return seatTypeId;
	}

	public void setSeatTypeId(Integer seatTypeId) {
		this.seatTypeId = seatTypeId;
	}

	public String getSeatTypeDesc() {
		return seatTypeDesc;
	}

	public void setSeatTypeDesc(String seatTypeDesc) {
		this.seatTypeDesc = seatTypeDesc;
	}

	public float getSeatFare() {
		return seatFare;
	}

	public void setSeatFare(float seatFare) {
		this.seatFare = seatFare;
	}

	@OneToMany(mappedBy = "seatType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<HallCapacity> hallCapacity;

}
