package com.repository;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.FlightDetails;

@Repository
public interface FlightRepository extends CrudRepository<FlightDetails,Integer>{
	public List<FlightDetails> findByDepartureDate(String departureDate);
	@Query(value="select * from Flight where origin=? and destination=?")
	public List<FlightDetails> findByOriginAndDestination(String origin,String destination);
}