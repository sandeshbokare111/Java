package com.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.FlightDetails;

@Repository
public interface FlightRepository extends CrudRepository<FlightDetails,Integer>{
	public List<FlightDetails> findByDepartureDate(Date departureDate);
}