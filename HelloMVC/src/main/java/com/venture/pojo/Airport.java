package com.venture.pojo;
/**
 * 封装名字和机场代码
 * @author liwenqiang
 *
 */
public class Airport {
	private String name;
	private String airportCode;
	
	
	public Airport() {
	}
	public Airport(String name, String airportCode) {
		this.name = name;
		this.airportCode = airportCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	@Override
	public String toString() {
		return name + "(" +airportCode +")";
	}
	
}
