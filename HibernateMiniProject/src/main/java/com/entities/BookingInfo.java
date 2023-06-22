package com.entities;

import java.sql.Date;

public class BookingInfo {
	int bookingId;
	Date bookingDate;
	String CustomerName;
	long customer_phone;
	int room_Number;
	int DayToHireFor;
	int Fare;
	double Bill;
	@Override
	public String toString() {
		return "BookingInfo [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", CustomerName=" + CustomerName
				+ ", customer_phone=" + customer_phone + ", room_Number=" + room_Number + ", DayToHireFor="
				+ DayToHireFor + ", Fare=" + Fare + ", Bill=" + Bill + "]";
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public long getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(long customer_phone) {
		this.customer_phone = customer_phone;
	}
	public int getRoom_Number() {
		return room_Number;
	}
	public void setRoom_Number(int room_Number) {
		this.room_Number = room_Number;
	}
	public int getDayToHireFor() {
		return DayToHireFor;
	}
	public void setDayToHireFor(int dayToHireFor) {
		DayToHireFor = dayToHireFor;
	}
	public int getFare() {
		return Fare;
	}
	public void setFare(int fare) {
		Fare = fare;
	}
	public double getBill() {
		return Bill;
	}
	public void setBill(double bill) {
		Bill = bill;
	}
	public BookingInfo(int bookingId) {
		super();
		this.bookingId = bookingId;
	}
	public BookingInfo(int bookingId, Date bookingDate, String customerName, long customer_phone, int room_Number,
			int dayToHireFor, int fare, double bill) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		CustomerName = customerName;
		this.customer_phone = customer_phone;
		this.room_Number = room_Number;
		DayToHireFor = dayToHireFor;
		Fare = fare;
		Bill = bill;
	}


}
