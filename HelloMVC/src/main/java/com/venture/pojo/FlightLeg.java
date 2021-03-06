package com.venture.pojo;

import java.util.Date;

public class FlightLeg {
	private Airport departFrom;
	private Date departOn;
	private Airport arriveAt;
	private Date arriveOn;
	public FlightLeg(Airport departFrom, Date departOn, Airport arriveAt, Date arriveOn) {
		super();
		this.departFrom = departFrom;
		this.departOn = departOn;
		this.arriveAt = arriveAt;
		this.arriveOn = arriveOn;
	}
	public Airport getDepartFrom() {
		return departFrom;
	}
	public Date getDepartOn() {
		return departOn;
	}
	public Airport getArriveAt() {
		return arriveAt;
	}
	public Date getArriveOn() {
		return arriveOn;
	}
	
}
