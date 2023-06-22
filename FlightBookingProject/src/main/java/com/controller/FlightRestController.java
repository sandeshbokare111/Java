package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Response.ResponseHandler;
import com.model.FlightDetails;
import com.repository.FlightRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class FlightRestController {

	@Autowired
	FlightRepository fRepo;

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handler(MethodArgumentNotValidException ex) {
	Map<String, String> errorMap = new HashMap<>();
	
	ex.getBindingResult().getFieldErrors().forEach(errors->{
		errorMap.put(errors.getField(), errors.getDefaultMessage());
	});
	return errorMap;
	}

	@PreAuthorize("hasRole('USER')")
	@GetMapping("/flights")
	public ResponseEntity<List<FlightDetails>> getAllFlights() {
		List<FlightDetails> list = (List<FlightDetails>) fRepo.findAll();
		return new ResponseEntity<List<FlightDetails>>(list,HttpStatus.OK);
	}

	@GetMapping("/flightbyid/{flightId}")
	public ResponseEntity<Object> getFlightByID(@PathVariable("flightId") int flightID) {
		
		FlightDetails flight = fRepo.findById(flightID).get();
		
		System.out.println(HttpStatus.values());
		return ResponseHandler.responseBuilder("Description is required", HttpStatus.valueOf("OK") , flight);
//		return ResponseEntity.ok(flight);
//		return new ResponseEntity<FlightDetails>(flight, HttpStatus.OK);
	}

	@GetMapping("/flightbyorigin/{origin}/{destination}")
	public ResponseEntity<List<FlightDetails>> getFlightByOriginAndDestination(@PathVariable("origin") String origin,
			@PathVariable("destination") String destination) {
		List<FlightDetails> flight = (List<FlightDetails>) fRepo.findByOriginAndDestination(origin, destination);
		return new ResponseEntity<List<FlightDetails>>(flight, null, HttpStatus.NO_CONTENT.value());
	}

	@GetMapping("/flightbydate/{departureDate}")
	public List<FlightDetails> getByDate(@PathVariable("departureDate") String departureDate) {
		List<FlightDetails> list = fRepo.findByDepartureDate(departureDate);
		return list;
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/addflight")
	public int addFlightDetails(@RequestBody @Valid FlightDetails flightDetails) {
		FlightDetails fDetails = new FlightDetails();
		fDetails.setFlightname(flightDetails.getFlightname());
		fDetails.setOrigin(flightDetails.getOrigin());
		fDetails.setDestination(flightDetails.getDestination());
		fDetails.setDepartureDate(flightDetails.getDepartureDate());
		fDetails.setArrivalDate(flightDetails.getArrivalDate());
		fDetails.setPriceForEconomyClass(flightDetails.getPriceForEconomyClass());
		fDetails.setPriceForBusinessClass(flightDetails.getPriceForBusinessClass());
		fRepo.save(fDetails);
		return fDetails.getFlightId();
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/updateflight/{flightId}")
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

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/deleteflight/{flightId}")
	public FlightDetails deleteFlightDetails(@PathVariable("flightId") int flightId) {
		FlightDetails fd = new FlightDetails();
		fd = fRepo.findById(flightId).get();
		fRepo.deleteById(flightId);
		return fd;
	}

}