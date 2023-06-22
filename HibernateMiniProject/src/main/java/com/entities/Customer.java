package com.entities;

public class Customer {
	 int customerID;
	 String name;
	 String Gender;
	 int Age;
	 String Address;
	 long Phone;
	 @Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", Gender=" + Gender + ", Age=" + Age
				+ ", Address=" + Address + ", Phone=" + Phone + ", Email=" + Email + "]";
	}
	public Customer() {
		super();
	}
	String  Email;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Customer(int customerID) {
		super();
		this.customerID = customerID;
	}
	public Customer(int customerID, String name, String gender, int age, String address, long phone, String email) {
		super();
		this.customerID = customerID;
		this.name = name;
		Gender = gender;
		Age = age;
		Address = address;
		Phone = phone;
		Email = email;
	}
}
