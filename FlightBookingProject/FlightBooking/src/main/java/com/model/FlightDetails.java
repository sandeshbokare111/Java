package com.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="FlightDetails")
public class FlightDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int flightId;
	@NotBlank(message="Flight should not be blank")
	String flightname;
	@NotBlank(message="Origin should not blank")
	String origin;
	@NotBlank(message="Destination should not blank")
	String destination;
	@NotEmpty(message="Departure date must not empty")
	Date departureDate;
	@NotEmpty(message="Arrival date must not empty")
	Date arrivalDate;
	@Min(value = 1, message="Value should  be greater than zero")
	int priceForEconomyClass;
	@Min(value = 1, message="Value should  be greater than zero")
	int priceForBusinessClass;
	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", flightname=" + flightname + ", origin=" + origin
				+ ", destination=" + destination + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate
				+ ", priceForEconomyClass=" + priceForEconomyClass + ", priceForBusinessClass=" + priceForBusinessClass
				+ "]";
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public int getPriceForEconomyClass() {
		return priceForEconomyClass;
	}
	public void setPriceForEconomyClass(int priceForEconomyClass) {
		this.priceForEconomyClass = priceForEconomyClass;
	}
	public int getPriceForBusinessClass() {
		return priceForBusinessClass;
	}
	public void setPriceForBusinessClass(int priceForBusinessClass) {
		this.priceForBusinessClass = priceForBusinessClass;
	}
	public FlightDetails(int flightId, String flightname, String origin, String destination, Date departureDate,
			Date arrivalDate, int priceForEconomyClass, int priceForBusinessClass) {
		super();
		this.flightId = flightId;
		this.flightname = flightname;
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.priceForEconomyClass = priceForEconomyClass;
		this.priceForBusinessClass = priceForBusinessClass;
	}
	public FlightDetails() {
		super();
	}
	

}
