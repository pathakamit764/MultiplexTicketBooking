package com.MTB.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Hall_Capacity_Master")
public class HallCapacity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hallCapacityId;
	@ManyToOne
	@JoinColumn(name = "hall_id")
	private Hall halls;
	@ManyToOne
	@JoinColumn(name = "seat_type_id")
	private SeatType seatType;
	private Integer seatCount;

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}

	public Integer getHallCapacityId() {
		return hallCapacityId;
	}

	public void setHallCapacityId(Integer hallCapacityId) {
		this.hallCapacityId = hallCapacityId;
	}

	public Hall getHalls() {
		return halls;
	}

	public void setHalls(Hall halls) {
		this.halls = halls;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

}
