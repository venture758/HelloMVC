package com.venture.service;

import java.util.List;

import com.venture.pojo.FightSearchCriteria;
import com.venture.pojo.Flight;
import com.venture.pojo.SpecialDeal;

public interface FlightService {
	List<SpecialDeal> getSpecialDeals();
	List<Flight> findFlights(FightSearchCriteria serach);
}
