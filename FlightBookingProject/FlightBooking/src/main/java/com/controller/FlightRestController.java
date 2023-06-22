package com.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.FlightDetails;
import com.repository.FlightRepository;

import jakarta.validation.Valid;

@RequestMapping("/api")
public class FlightRestController {

	@Autowired
	FlightRepository fRepo;

	@GetMapping("/flights")
	public List<FlightDetails> getAllFlights() {
		List<FlightDetails> list = (List<FlightDetails>) fRepo.findAll();
		return list;

	}

	@GetMapping("/flight/{flightId}")
	public FlightDetails getFlightByID(@PathVariable("flightID") int flightID) {
		FlightDetails flight = fRepo.findById(flightID).get();
		return flight;

	}

//	@GetMapping("/flight/{origin}/{destination}")
//	public String getFlightByOriginAndDestination(){
//		
//	}

	@PostMapping("/flight")
	public FlightDetails addFlightDetails(@RequestBody  @Valid FlightDetails flightDetails) {
//		FlightDetails fDetails = new FlightDetails();
//		fDetails.setArrivalDate(flightDetails.getArrivalDate());
//		fDetails.setDepartureDate(flightDetails.getDepartureDate());
//		fDetails.setDestination(flightDetails.getDestination());
//		fDetails.setFlightname(flightDetails.getFlightname());
//		fDetails.setOrigin(flightDetails.getOrigin());
//		fDetails.setPriceForBusinessClass(flightDetails.getPriceForBusinessClass());
//		fDetails.setPriceForEconomyClass(flightDetails.getPriceForEconomyClass());
//		fRepo.save(fDetails);
		return fRepo.save(flightDetails);
	}

	@PutMapping("/flight/{flightId}")
	public FlightDetails updateFlightDetails(@RequestBody FlightDetails flightDetails,
			@PathVariable("flightId") int flightId) {
		Optional<FlightDetails> fId = fRepo.findById(flightId);
		FlightDetails fDetails = new FlightDetails();
		fDetails = fId.get();
		fDetails.setArrivalDate(flightDetails.getArrivalDate());
		fDetails.setDepartureDate(flightDetails.getDepartureDate());
		fDetails.setDestination(flightDetails.getDestination());
		fDetails.setFlightname(flightDetails.getFlightname());
		fDetails.setOrigin(flightDetails.getOrigin());
		fDetails.setPriceForBusinessClass(flightDetails.getPriceForBusinessClass());
		fDetails.setPriceForEconomyClass(flightDetails.getPriceForEconomyClass());
		fRepo.save(fDetails);
		return fDetails;
	}

	@DeleteMapping("/flight/{flightId}")
	public FlightDetails deleteFlightDetails(@PathVariable("flightId") int flightId) {
		FlightDetails fd = new FlightDetails();
		fd = fRepo.findById(flightId).get();
		fRepo.deleteById(flightId);
		return fd;
	}

	@GetMapping("/flight/{date}")
	public List<FlightDetails> getByDate(@PathVariable("departureDate") Date departureDate) {
		List<FlightDetails> list = fRepo.findByDepartureDate(departureDate);
		return list;
	}

}