package com.venture.pojo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.util.Assert;

public class Flight {
	private List<FlightLeg> legs;
	private BigDecimal totalCost;
	public Flight(List<FlightLeg> legs, BigDecimal totalCost) {
		Assert.notNull(legs);
		Assert.isTrue(legs.size() >=1, "Flights must have at least one leg");
		this.legs = legs;
		this.totalCost = totalCost;
	}
	public List<FlightLeg> getLegs() {
		return legs;
	}
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	
	public boolean isNonStop(){
		return (legs.size() ==1);
	}
	
	public Airport getDepartFrom(){
		return getFirstLeg().getDepartFrom();
	}
	
	private FlightLeg getFirstLeg(){
		return legs.get(0);
	}
	private FlightLeg getLastLeg(){
		return legs.get(legs.size() -1);
	}
	public Airport getArrivalAt(){
		return getLastLeg().getArriveAt();
	}
	
	public int getNumberOflegs(){
		return legs.size();
	}
	
	
}
